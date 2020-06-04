package asm.org.apache.ws.commons.schema;
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
public class XmlSchemaAttributeGroupRefDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/ws/commons/schema/XmlSchemaAttributeGroupRef", "Lorg/apache/ws/commons/schema/XmlSchemaAttributeOrGroupRef;Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroupMember;Lorg/apache/ws/commons/schema/XmlSchemaItemWithRef<Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;>;", "org/apache/ws/commons/schema/XmlSchemaAttributeOrGroupRef", new String[] { "org/apache/ws/commons/schema/XmlSchemaAttributeGroupMember", "org/apache/ws/commons/schema/XmlSchemaItemWithRef" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ref", "Lorg/apache/ws/commons/schema/utils/XmlSchemaRef;", "Lorg/apache/ws/commons/schema/utils/XmlSchemaRef<Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/ws/commons/schema/XmlSchema;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/XmlSchemaAttributeOrGroupRef", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/ws/commons/schema/utils/XmlSchemaRef");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/utils/XmlSchemaRef", "<init>", "(Lorg/apache/ws/commons/schema/XmlSchema;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroupRef", "ref", "Lorg/apache/ws/commons/schema/utils/XmlSchemaRef;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRef", "()Lorg/apache/ws/commons/schema/utils/XmlSchemaRef;", "()Lorg/apache/ws/commons/schema/utils/XmlSchemaRef<Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroupRef", "ref", "Lorg/apache/ws/commons/schema/utils/XmlSchemaRef;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isRef", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroupRef", "ref", "Lorg/apache/ws/commons/schema/utils/XmlSchemaRef;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaRef", "getTargetQName", "()Ljavax/xml/namespace/QName;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTargetQName", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroupRef", "ref", "Lorg/apache/ws/commons/schema/utils/XmlSchemaRef;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaRef", "getTargetQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRefBase", "()Lorg/apache/ws/commons/schema/utils/XmlSchemaRefBase;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroupRef", "ref", "Lorg/apache/ws/commons/schema/utils/XmlSchemaRef;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
