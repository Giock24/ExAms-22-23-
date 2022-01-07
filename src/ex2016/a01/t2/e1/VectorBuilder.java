package ex2016.a01.t2.e1;

import java.util.Optional;

/* 
 * A builder for Vector, where one can add/remove elements, reverse, clear and finally, call
 * build() just once to retrieve the produced vector. Additionally, there is a buildWithFilter
 * for building only if a filter passes all the elements, and a mapToNewBuilder which creates a new builder.  
 */

interface VectorBuilder<X> {
    
    /**
     * Adds @param x to the current sequence
     */
    void addElement(X x);
    
    /**
     * Removes the elements at position @param x
     */
    void removeElement(int position);
    
    /**
     * Reverses the current sequence (e.g., from [1,2,3] to [3,2,1]) 
     */
    void reverse();
    
    /**
     * Removes all the elements from the current sequence 
     */
    void clear();
    
    /**
     * Builds and returns the vector. It provides no result (Optional.empty) if 
     * build was previously called with success. 
     */
    Optional<Vector<X>> build();
    
    /**
     * Builds and returns the vector, but only if all elements pass the filter
     * (invocation of method check on the filter).
     * It returns Optional.empty if some element does no pass the filter, or
     * if a build was previously called with success.
     */
    Optional<Vector<X>> buildWithFilter(Filter<X> filter);
    
    /**
     * Creates a new Builder, mapping all elements in the current vector.
     * E.g., from vector [1,2,3] to a new vector ["s1","s2","s3"] with a 
     * map expressed by lambda (i -> "s"+i)
     */
    <Y> VectorBuilder<Y> mapToNewBuilder(Mapper<X,Y> mapper);
    
    /**
     * Simply, VectorBuilder.Filter is the contract to be used for method buildWithFilter 
     */
    interface Filter<X> {
        boolean check(X x);
    }
    
    /**
     * Simply, VectorBuilder.Mapper is the contract to be used for method mapToNewBuilder 
     */
    interface Mapper<X,Y> {
        Y transform(X x);
    }
    
    //public List<X> getList();
}
