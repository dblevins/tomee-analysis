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
public class XmlSchemaAttributeGroup$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup$2", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/ws/commons/schema/XmlSchemaAttributeGroup", "setName", "(Ljava/lang/String;)V");

classWriter.visitInnerClass("org/apache/ws/commons/schema/XmlSchemaAttributeGroup$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$fName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup$2", "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup$2", "val$fName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup$2", "val$fName", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup$2", "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup", "access$000", "(Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;)Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "getParent", "()Lorg/apache/ws/commons/schema/XmlSchema;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchema", "getAttributeGroups", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup$2", "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup", "getQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup$2", "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup", "access$000", "(Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;)Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup$2", "val$fName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "setName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup$2", "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup", "access$000", "(Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;)Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "getParent", "()Lorg/apache/ws/commons/schema/XmlSchema;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchema", "getAttributeGroups", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup$2", "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup", "getQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup$2", "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
