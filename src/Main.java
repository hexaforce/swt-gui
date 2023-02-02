import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Main {

  public static void main(String[] args) {
    new Main().launch(args);
  }

  final Display display = new Display();
  final Shell shell = new Shell(display);
  final RowLayout layout = new RowLayout();

  void launch(String[] args) {

    shell.setLayout(layout);

    /* Create the SWT button */
    final Button swtButton = new Button(shell, SWT.PUSH);
    swtButton.setText("SWT Button");

    shell.open();
    while (!shell.isDisposed()) {
      if (!display.readAndDispatch()) {
        display.sleep();
      }
    }

    display.dispose();

  }

}
