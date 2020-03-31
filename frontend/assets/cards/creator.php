<?php
	$colorToReplace = "#ff5555";
    $colorToGet = array("#5555ff", "#ffaa00", "#55aa55");

	$colorNameToReplace = "red";
	$colorNameToGet = array("blue", "yellow", "green");

	$files = glob("*_red.svg");
	for($i=0; $i<count($files); $i++){
        for($j=0; $j<count($colorToGet); $j++){
            $content = file_get_contents($files[$i]);
		    $content = str_replace($colorToReplace, $colorToGet[$j], $content);
		    file_put_contents(str_replace($colorNameToReplace, $colorNameToGet[$j], $files[$i]), $content);
        }
	}
?>
