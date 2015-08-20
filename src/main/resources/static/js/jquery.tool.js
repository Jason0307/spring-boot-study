/**
 * Used to operate the page doms
 * @author Jason
 */
(function($) {
	
	$(document).on('click', function(event) {
		var currentDialogLength = $(event.target).closest('.qutton-dialog').length;
		if(!currentDialogLength) {
			hideCommentDialog();
		} 
		
	});
	
	$('.fa-comment').on('click', function(event){
		console.log('comment button clicked');
		hideCommentDialog();
		event.preventDefault();
		$(this).parent().next().removeClass('hide').addClass('show');
		if(event.stopPropagation) {
	        event.stopPropagation();
	    } else {
	        event.cancelBubble = true;
	    }
	});
	
	function hideCommentDialog () {
		$('.qutton-dialog').each(function() {
			$(this).removeClass('show').addClass('hide');
		})
	}
})(jQuery)