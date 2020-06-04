import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class module-infoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V9, ACC_MODULE, "module-info", null, null, null);

ModuleVisitor moduleVisitor = classWriter.visitModule("com.sun.xml.fastinfoset", 0, null);

moduleVisitor.visitRequire("java.base", ACC_MANDATED, "11");
moduleVisitor.visitRequire("java.logging", 0, "11");
moduleVisitor.visitRequire("java.xml", ACC_TRANSITIVE, "11");
moduleVisitor.visitExport("com/sun/xml/fastinfoset", 0);
moduleVisitor.visitExport("com/sun/xml/fastinfoset/stax", 0);
moduleVisitor.visitExport("com/sun/xml/fastinfoset/vocab", 0);
moduleVisitor.visitExport("org/jvnet/fastinfoset", 0);
moduleVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
