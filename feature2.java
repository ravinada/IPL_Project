
//feature 2 MatchesWonByEachTeam
    static ArrayList<ArrayList<String>> getMatchesWonByEachTeam(ArrayList<ArrayList<String>> matchesData){

        ArrayList<ArrayList<String>> result2 = new ArrayList<ArrayList<String>>();
        HashMap<String,Integer> map2 = new HashMap<>();

        for(ArrayList<String> list2 : matchesData){
            String team_name = list2.get(10);  //get winner column
            if(team_name.length()==0){
                team_name = "no result";  //blank than no result
            }
            if(map2.containsKey(team_name)){
                map2.put(team_name,map2.get(team_name)+1);   //team available than increment counter
                continue;
            }
            map2.put(team_name,1);    //else simply add one value
        }

        for(String team_name : map2.keySet()){
            ArrayList<String> list2 = new ArrayList<>();
            list2.add(team_name);     //add team name
            list2.add(map2.get(team_name)+"");    //get value with respect to team name
            result2.add(list2);  //add list in map
        }
        return result2;
    }



}