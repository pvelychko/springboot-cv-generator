function longToDate() {
	var longDates = document.getElementsByClassName("longDate");
    for(var i = 0; i < longDates.length; i++) {
		var longDate = new Date(longDates.item(i).innerHTML * 1);
		longDates.item(i).innerHTML = 
			longDate.getDate()  + "." + (longDate.getMonth() + 1) + "." + longDate.getFullYear();
    }
}
