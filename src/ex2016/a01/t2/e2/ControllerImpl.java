package ex2016.a01.t2.e2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller {
	
	private final static String HOME = System.getProperty("user.home");
	private final static String SEP = File.separator;
	private final static int TWO = 2;
	
	private String PATH = ControllerImpl.HOME + ControllerImpl.SEP + "default.txt";
	private File file = new File(PATH);
	private List<Integer> num = new ArrayList<>();
	
	private int mulTwo = 2;
	
	public ControllerImpl() {
	}

	@Override
	public void nameFile(final String name) {
		this.PATH = ControllerImpl.HOME + ControllerImpl.SEP + name;
		this.file = new File(this.PATH);
	}

	@Override
	public void plusONE() {
		this.num.add(1);
	}

	@Override
	public void rng() {
		final Random rand = new Random();
		this.num.add(rand.nextInt(100) * -1);
	}

	@Override
	public void mulByTwo() {
		this.num.add(this.mulTwo);
		this.mulTwo = this.mulTwo * ControllerImpl.TWO;
	}

	/**
	 * Reset all number memorized
	 */
	private void reset() {
		this.num = new ArrayList<>();
		this.mulTwo = 2;
	}
	
	// I created this method to using the pattern Strategy
	@Override
	public void addElement(Supplier<Integer> elem) {
		this.num.add(elem.supply());
	}

	@Override
	public void writeAll() {
		try (FileWriter file2 = new FileWriter(this.file)) {
    		file2.write(this.num.toString());
    	} catch (IOException e1) {
			e1.printStackTrace();
		}
		this.reset();
	}

	@Override
	public List<Integer> getCurrentSequece() {
		return this.num.stream().collect(Collectors.toList());
	}

}
