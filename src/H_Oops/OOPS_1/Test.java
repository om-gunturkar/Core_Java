package H_Oops.OOPS_1;

public class Test {

    public static void main(String[] args) {

        SubBranchAxis a1 = new SubBranchAxis();
        a1.showAxisBank();
        a1.ShowBank();
        a1.showSubBranchAxisBank();

        SubBranchHdfc h1 = new SubBranchHdfc();
        h1.ShowBank();
        h1.showHdfcBank();
        h1.showSubBranchHdfcBank();
    }
}
/* Output -
Show Axis bank details!!!
Show bank details!!!
Show SubBranch of Axis bank details!!!
Show bank details!!!
Show HDFC bank details!!!
Show SubBranch of HDFC bank details!!!
 */
