public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

        if (numRows < 0) {
            return null;
        }

         List<List<Integer>> list = new ArrayList<>();

        if (numRows >= 1) {
            List<Integer> data = new ArrayList<>();
            data.add(1);
            list.add(data);
        }

        if (numRows >= 2) {
            List<Integer> data = new ArrayList<>();
            data.add(1);
            data.add(1);
            list.add(data);
        }

        if (numRows >=3) {
            for (int i = 3; i <=numRows; i++) {
                List<Integer> data = new ArrayList<>();
                List<Integer> prev = list.get(i - 2);
                data.add(1);
                for (int j = 2; j <= i -1; j++) {
                    data.add(prev.get(j - 2) + prev.get(j - 1));
                }
                data.add(1);

                list.add(data);
            }
        }

        return list;
    }
}