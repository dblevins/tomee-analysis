package asm.org.apache.cxf.ws.policy.v200607;
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
public class OperatorContentTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/ws/policy/v200607/OperatorContentType", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/xml/bind/annotation/XmlAccessorType;", true);
annotationVisitor0.visitEnum("value", "Ljakarta/xml/bind/annotation/XmlAccessType;", "FIELD");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/xml/bind/annotation/XmlType;", true);
annotationVisitor0.visit("name", "OperatorContentType");
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("propOrder");
annotationVisitor1.visit(null, "policyOrAllOrExactlyOne");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/xml/bind/annotation/XmlSeeAlso;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, Type.getType("Lorg/apache/cxf/ws/policy/v200607/Policy;"));
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "policyOrAllOrExactlyOne", "Ljava/util/List;", "Ljava/util/List<Ljava/lang/Object;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlElementRefs;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Ljakarta/xml/bind/annotation/XmlElementRef;");
annotationVisitor2.visit("name", "Policy");
annotationVisitor2.visit("namespace", "http://www.w3.org/2006/07/ws-policy");
annotationVisitor2.visit("type", Type.getType("Lorg/apache/cxf/ws/policy/v200607/Policy;"));
annotationVisitor2.visit("required", Boolean.FALSE);
annotationVisitor2.visitEnd();
}
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Ljakarta/xml/bind/annotation/XmlElementRef;");
annotationVisitor2.visit("name", "All");
annotationVisitor2.visit("namespace", "http://www.w3.org/2006/07/ws-policy");
annotationVisitor2.visit("type", Type.getType("Ljakarta/xml/bind/JAXBElement;"));
annotationVisitor2.visit("required", Boolean.FALSE);
annotationVisitor2.visitEnd();
}
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Ljakarta/xml/bind/annotation/XmlElementRef;");
annotationVisitor2.visit("name", "ExactlyOne");
annotationVisitor2.visit("namespace", "http://www.w3.org/2006/07/ws-policy");
annotationVisitor2.visit("type", Type.getType("Ljakarta/xml/bind/JAXBElement;"));
annotationVisitor2.visit("required", Boolean.FALSE);
annotationVisitor2.visitEnd();
}
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Ljakarta/xml/bind/annotation/XmlElementRef;");
annotationVisitor2.visit("name", "PolicyReference");
annotationVisitor2.visit("namespace", "http://www.w3.org/2006/07/ws-policy");
annotationVisitor2.visit("type", Type.getType("Lorg/apache/cxf/ws/policy/v200607/PolicyReference;"));
annotationVisitor2.visit("required", Boolean.FALSE);
annotationVisitor2.visitEnd();
}
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlAnyElement;", true);
annotationVisitor0.visit("lax", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPolicyOrAllOrExactlyOne", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/policy/v200607/OperatorContentType", "policyOrAllOrExactlyOne", "Ljava/util/List;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/policy/v200607/OperatorContentType", "policyOrAllOrExactlyOne", "Ljava/util/List;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/policy/v200607/OperatorContentType", "policyOrAllOrExactlyOne", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}