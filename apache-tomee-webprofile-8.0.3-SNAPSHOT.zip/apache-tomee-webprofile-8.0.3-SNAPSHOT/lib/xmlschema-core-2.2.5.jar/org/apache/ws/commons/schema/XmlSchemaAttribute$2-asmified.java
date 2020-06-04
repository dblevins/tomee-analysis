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
public class XmlSchemaAttribute$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/ws/commons/schema/XmlSchemaAttribute$2", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/ws/commons/schema/XmlSchemaAttribute", "setName", "(Ljava/lang/String;)V");

classWriter.visitInnerClass("org/apache/ws/commons/schema/XmlSchemaAttribute$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$fName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttribute;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/ws/commons/schema/XmlSchemaAttribute;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaAttribute$2", "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttribute;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaAttribute$2", "val$fName", "Ljava/lang/String;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttribute$2", "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttribute;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/ws/commons/schema/XmlSchemaAttribute", "access$000", "(Lorg/apache/ws/commons/schema/XmlSchemaAttribute;)Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedWithFormImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedWithFormImpl", "isTopLevel", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttribute$2", "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttribute;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/ws/commons/schema/XmlSchemaAttribute", "access$000", "(Lorg/apache/ws/commons/schema/XmlSchemaAttribute;)Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedWithFormImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedWithFormImpl", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttribute$2", "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttribute;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/ws/commons/schema/XmlSchemaAttribute", "access$000", "(Lorg/apache/ws/commons/schema/XmlSchemaAttribute;)Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedWithFormImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedWithFormImpl", "getParent", "()Lorg/apache/ws/commons/schema/XmlSchema;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchema", "getAttributes", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttribute$2", "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttribute;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchemaAttribute", "getQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttribute$2", "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttribute;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/ws/commons/schema/XmlSchemaAttribute", "access$000", "(Lorg/apache/ws/commons/schema/XmlSchemaAttribute;)Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedWithFormImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttribute$2", "val$fName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedWithFormImpl", "setName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttribute$2", "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttribute;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/ws/commons/schema/XmlSchemaAttribute", "access$000", "(Lorg/apache/ws/commons/schema/XmlSchemaAttribute;)Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedWithFormImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedWithFormImpl", "isTopLevel", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttribute$2", "val$fName", "Ljava/lang/String;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/ws/commons/schema/XmlSchemaException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Top-level attributes may not be anonymous");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/XmlSchemaException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttribute$2", "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttribute;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/ws/commons/schema/XmlSchemaAttribute", "access$000", "(Lorg/apache/ws/commons/schema/XmlSchemaAttribute;)Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedWithFormImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedWithFormImpl", "getParent", "()Lorg/apache/ws/commons/schema/XmlSchema;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchema", "getAttributes", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttribute$2", "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttribute;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchemaAttribute", "getQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttribute$2", "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaAttribute;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
