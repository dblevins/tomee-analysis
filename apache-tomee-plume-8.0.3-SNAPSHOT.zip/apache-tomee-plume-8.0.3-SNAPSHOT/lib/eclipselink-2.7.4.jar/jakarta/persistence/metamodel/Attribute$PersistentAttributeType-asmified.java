package asm.jakarta.persistence.metamodel;
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
public class Attribute$PersistentAttributeTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "Ljava/lang/Enum<Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "jakarta/persistence/metamodel/Attribute", "PersistentAttributeType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MANY_TO_ONE", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ONE_TO_ONE", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BASIC", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EMBEDDED", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MANY_TO_MANY", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ONE_TO_MANY", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ELEMENT_COLLECTION", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "ENUM$VALUES", "[Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MANY_TO_ONE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "MANY_TO_ONE", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ONE_TO_ONE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "ONE_TO_ONE", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BASIC");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "BASIC", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EMBEDDED");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "EMBEDDED", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MANY_TO_MANY");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "MANY_TO_MANY", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ONE_TO_MANY");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "ONE_TO_MANY", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ELEMENT_COLLECTION");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "ELEMENT_COLLECTION", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "MANY_TO_ONE", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "ONE_TO_ONE", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "BASIC", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "EMBEDDED", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "MANY_TO_MANY", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "ONE_TO_MANY", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "ELEMENT_COLLECTION", "Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "ENUM$VALUES", "[Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType", "ENUM$VALUES", "[Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/persistence/metamodel/Attribute$PersistentAttributeType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/metamodel/Attribute$PersistentAttributeType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
