/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jpdfviewer.rhino;

import com.qoppa.pdf.PDFException;
import com.qoppa.pdfViewer.PDFViewerBean;
import org.mozilla.javascript.ContextFactory;

public final class App
{
    public static void main(String[] args) throws PDFException
    {
        // Initialize Rhino
        ContextFactory.initGlobal(new ContextFactory());

        // Load a PDF in jPDFViewer
        var viewer = new PDFViewerBean();
        var pdf = ClassLoader.getSystemResourceAsStream("test.pdf");
        viewer.loadPDF(pdf);
    }
}
