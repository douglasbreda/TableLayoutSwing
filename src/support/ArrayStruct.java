/*
    Contém a estrutura básica de um array para um melhor controle no layout
*/
package support;

/**
 *
 * @author Douglas
 */
public class ArrayStruct {
    
    private int row;
    private int column;

    public ArrayStruct(int row, int column) {
        this.row = row;
        this.column = column;
    }
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
