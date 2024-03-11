<!DOCTYPE html>
<html>
<head>
    <title>Scacchiera 20x20 </title>
</head>
<body>
    <table >
        <?php
            for ($row = 0; $row < 20; $row++) {
                echo "<tr>";
                for ($col = 0; $col < 20; $col++) {
                    //coloro le celle 
                   if(($row + $col) % 2 !== 0)
                    {
                        echo "<td style=\"width: 40px; height: 40px; border: 1px solid #ccc; text-align: center; vertical-align: middle; background-color: white; color: black;\"> </td>";
                    } else {
                        echo "<td style=\"width: 40px; height: 40px; border: 1px solid #ccc; text-align: center; vertical-align: middle; background-color: black; color: white;\"> </td>";
                    }
                }
                echo "</tr>";
            }
        ?>
    </table>
</body>
</html>

