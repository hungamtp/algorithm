package com.company.common;

public class GeneratingPagination {
    public static void main(String[] args) {
        printPage(5 , 8);
        printPage(5 , 50);
    }
    
    public static void printPage(int currentPage , int totalPages){
        if(totalPages > 10){
        int maxPage = totalPages - currentPage > 5 ? currentPage + 5 : currentPage + (10 - (totalPages- currentPage));
            for (int i = totalPages - currentPage > 5 ? currentPage -5 :currentPage-(10- (totalPages -currentPage)); i < maxPage ; i++ ){
                System.out.println(currentPage == i ? "currentPage" : i);
            }
        }else{
            for(int i = 0; i < totalPages; i++){
                System.out.println(currentPage == i ? "currentPage" : i);
            }
        }
    }
}
