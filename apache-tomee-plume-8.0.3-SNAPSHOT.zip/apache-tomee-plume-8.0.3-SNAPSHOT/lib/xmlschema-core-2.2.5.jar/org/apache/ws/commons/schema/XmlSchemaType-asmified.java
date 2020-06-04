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
public class XmlSchemaTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/ws/commons/schema/XmlSchemaType", null, "org/apache/ws/commons/schema/XmlSchemaAnnotated", new String[] { "org/apache/ws/commons/schema/utils/XmlSchemaNamed" });

classWriter.visitInnerClass("org/apache/ws/commons/schema/XmlSchemaType$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "deriveBy", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "finalDerivation", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "finalResolved", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "isMixed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/ws/commons/schema/XmlSchema;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/XmlSchemaAnnotated", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "<init>", "(Lorg/apache/ws/commons/schema/XmlSchema;Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/ws/commons/schema/XmlSchemaDerivationMethod", "NONE", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "finalDerivation", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/ws/commons/schema/XmlSchemaType$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/XmlSchemaType$1", "<init>", "(Lorg/apache/ws/commons/schema/XmlSchemaType;Lorg/apache/ws/commons/schema/XmlSchema;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/ws/commons/schema/utils/CollectionFactory", "withSchemaModifiable", "(Ljava/lang/Runnable;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/ws/commons/schema/XmlSchemaType", "org/apache/ws/commons/schema/XmlSchema", Opcodes.INTEGER, "org/apache/ws/commons/schema/XmlSchema"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/XmlSchemaAnnotated", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/ws/commons/schema/XmlSchemaType");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/ws/commons/schema/XmlSchemaType");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "isMixed", "Z");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "isMixed", "Z");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/ws/commons/schema/XmlSchemaType"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "deriveBy", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "deriveBy", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/ws/commons/schema/utils/UtilObjects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "finalDerivation", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "finalDerivation", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/ws/commons/schema/utils/UtilObjects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "finalResolved", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "finalResolved", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/ws/commons/schema/utils/UtilObjects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/ws/commons/schema/utils/UtilObjects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitInsn(ICONST_1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/ws/commons/schema/XmlSchemaType", "java/lang/Object", Opcodes.INTEGER, "org/apache/ws/commons/schema/XmlSchemaType", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "deriveBy", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "finalDerivation", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "finalResolved", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "hashCode", "([Ljava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "isMixed", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitIntInsn(BIPUSH, 29);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/ws/commons/schema/XmlSchemaType", Opcodes.INTEGER}, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitIntInsn(BIPUSH, 83);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/ws/commons/schema/XmlSchemaType", Opcodes.INTEGER}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/XmlSchemaAnnotated", "hashCode", "()I", false);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDeriveBy", "()Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "deriveBy", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFinal", "()Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "finalDerivation", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFinal", "(Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "finalDerivation", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFinalResolved", "()Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "finalResolved", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isMixed", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "isMixed", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMixed", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "isMixed", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchemaType", "getName", "()Ljava/lang/String;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/XmlSchemaAnnotated", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("[anonymous]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "getParent", "()Lorg/apache/ws/commons/schema/XmlSchema;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchema", "getLogicalTargetNamespace", "()Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/XmlSchemaAnnotated", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("[{}");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchemaType", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/XmlSchemaAnnotated", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("[{");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "getParent", "()Lorg/apache/ws/commons/schema/XmlSchema;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchema", "getLogicalTargetNamespace", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("}");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchemaType", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParent", "()Lorg/apache/ws/commons/schema/XmlSchema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "getParent", "()Lorg/apache/ws/commons/schema/XmlSchema;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQName", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "getQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAnonymous", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "isAnonymous", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isTopLevel", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "isTopLevel", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchemaType", "isTopLevel", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/ws/commons/schema/XmlSchemaException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("A non-top-level type may not be anonyous.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/XmlSchemaException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "isTopLevel", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "getParent", "()Lorg/apache/ws/commons/schema/XmlSchema;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchema", "getSchemaTypes", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchemaType", "getQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "setName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "isTopLevel", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "getParent", "()Lorg/apache/ws/commons/schema/XmlSchema;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchema", "getSchemaTypes", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchemaType", "getQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "setFinalResolved", "(Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "finalResolved", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFinalDerivation", "(Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "finalDerivation", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFinalDerivation", "()Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "finalDerivation", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDeriveBy", "(Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaType", "deriveBy", "Lorg/apache/ws/commons/schema/XmlSchemaDerivationMethod;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
