$(document).ready(function(){

	function next(){
		var nextSibling = $(".current").next(".slide");

		if ($(nextSibling).length === 0) {
			return;
		}
	
		//Make Previous as hidden
		$(".current").prev(".slide").removeClass("previous").addClass("hidden");

		//Make current as previous
		$(".current").removeClass("current").addClass("previous");
	

		//make next as current
		$(nextSibling).removeClass("next").addClass("current");
		//make next hidden as next
		$(nextSibling).next(".slide").removeClass("hidden").addClass("next");
	}

	function prev(){
		var prevSibling = $(".current").prev(".slide");
		if ($(prevSibling).length === 0) {
			return;
		}

		//Make next as hidden
		$(".current").next(".slide").removeClass("next").addClass("hidden");
		//Make current as next
		$(".current").removeClass("current").addClass("next");
		

		//make previous as current
		$(prevSibling).removeClass("previous").addClass("current");
		//make previous hidden as previous
		$(prevSibling).prev(".slide").removeClass("hidden").addClass("previous");

	}


	$(document).keypress(function(e){

			var code = e.keyCode ? e.keyCode : e.which;
			if(code === 37){
				prev();
			}
			else if(code === 39){
				next();
			}
	});


});