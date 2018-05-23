/**
 * Created by annaxlu on 5/23/18.
 */
public class findSubset {
    public void findSubset(char[] input, int index, StringBuilder solution) {
        if(index == input.length ) {
            System.out.println(solution);
            return;
        }

        //case 1: 要
        solution.append(input[index]);
        findSubset(input, index+1, solution);
        solution.deleteCharAt(solution.length()-1); //因为要回溯 所以必须吐出来

        //case 2:不要
        findSubset(input, index+1, solution);
        //这里不能吐，因为没有加

    }
}
