package asm.org.apache.cxf.ws.security.sts.provider.model.wstrust14;
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
public class package_infoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_ABSTRACT | ACC_INTERFACE | ACC_SYNTHETIC, "org/apache/cxf/ws/security/sts/provider/model/wstrust14/package-info", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/xml/bind/annotation/XmlSchema;", true);
annotationVisitor0.visit("namespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200802");
annotationVisitor0.visitEnum("elementFormDefault", "Ljakarta/xml/bind/annotation/XmlNsForm;", "QUALIFIED");
annotationVisitor0.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
