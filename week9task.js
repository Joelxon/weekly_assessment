function diffArray(arr1, arr2) {
    let newArr = [];
  
    newArr = arr1.concat(arr2);
  
    function checkNum(num) {
      if (arr1.indexOf(num) === -1 || arr2.indexOf(num) === -1) {
        return num;
      }
    }
  
    return newArr.filter(checkNum);
  }
  console.log(diffArray([1, 2, 3, 5], [1, 2, 3, 4, 5]));
  
  console.log(
    diffArray(
      ["grass", "dirt", "pink wool", "dead shrub"],
      ["grass", "dirt", "dead shrub"]
    )
  );