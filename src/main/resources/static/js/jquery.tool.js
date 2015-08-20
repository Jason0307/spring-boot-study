/**
 * Used to operate the page doms
 * @author Jason
 */
(function($) {
	/** init the user info card  */
	$('.material-card').materialCard({
        icon_close: 'fa-chevron-left',
        icon_open: 'fa-info-circle',
        icon_spin: 'fa-spin-fast',
        card_activator: 'click'
    });

    $('.material-card').on('shown.material-card show.material-card hide.material-card hidden.material-card', function (event) {
        console.log(event.type, event.namespace, $(this));
    });
    
    
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