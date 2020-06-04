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

ModuleVisitor moduleVisitor = classWriter.visitModule("java.xml.bind", 0, null);

moduleVisitor.visitRequire("java.base", ACC_MANDATED, null);
moduleVisitor.visitRequire("jakarta.activation", ACC_TRANSITIVE, null);
moduleVisitor.visitRequire("java.xml", ACC_TRANSITIVE, null);
moduleVisitor.visitRequire("java.logging", 0, null);
moduleVisitor.visitRequire("java.desktop", 0, null);
moduleVisitor.visitExport("javax/xml/bind", 0);
moduleVisitor.visitExport("javax/xml/bind/annotation", 0);
moduleVisitor.visitExport("javax/xml/bind/annotation/adapters", 0);
moduleVisitor.visitExport("javax/xml/bind/attachment", 0);
moduleVisitor.visitExport("javax/xml/bind/helpers", 0);
moduleVisitor.visitExport("javax/xml/bind/util", 0);
moduleVisitor.visitUse("javax/xml/bind/JAXBContextFactory");
moduleVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
