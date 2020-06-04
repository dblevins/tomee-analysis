package asm.javax.persistence.metamodel;
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
public class PluralAttribute$CollectionTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "javax/persistence/metamodel/PluralAttribute$CollectionType", "Ljava/lang/Enum<Ljavax/persistence/metamodel/PluralAttribute$CollectionType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("javax/persistence/metamodel/PluralAttribute$CollectionType", "javax/persistence/metamodel/PluralAttribute", "CollectionType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COLLECTION", "Ljavax/persistence/metamodel/PluralAttribute$CollectionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SET", "Ljavax/persistence/metamodel/PluralAttribute$CollectionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LIST", "Ljavax/persistence/metamodel/PluralAttribute$CollectionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MAP", "Ljavax/persistence/metamodel/PluralAttribute$CollectionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljavax/persistence/metamodel/PluralAttribute$CollectionType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljavax/persistence/metamodel/PluralAttribute$CollectionType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/metamodel/PluralAttribute$CollectionType", "$VALUES", "[Ljavax/persistence/metamodel/PluralAttribute$CollectionType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljavax/persistence/metamodel/PluralAttribute$CollectionType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/persistence/metamodel/PluralAttribute$CollectionType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljavax/persistence/metamodel/PluralAttribute$CollectionType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/persistence/metamodel/PluralAttribute$CollectionType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/persistence/metamodel/PluralAttribute$CollectionType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
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
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/persistence/metamodel/PluralAttribute$CollectionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COLLECTION");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/persistence/metamodel/PluralAttribute$CollectionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/persistence/metamodel/PluralAttribute$CollectionType", "COLLECTION", "Ljavax/persistence/metamodel/PluralAttribute$CollectionType;");
methodVisitor.visitTypeInsn(NEW, "javax/persistence/metamodel/PluralAttribute$CollectionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SET");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/persistence/metamodel/PluralAttribute$CollectionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/persistence/metamodel/PluralAttribute$CollectionType", "SET", "Ljavax/persistence/metamodel/PluralAttribute$CollectionType;");
methodVisitor.visitTypeInsn(NEW, "javax/persistence/metamodel/PluralAttribute$CollectionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LIST");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/persistence/metamodel/PluralAttribute$CollectionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/persistence/metamodel/PluralAttribute$CollectionType", "LIST", "Ljavax/persistence/metamodel/PluralAttribute$CollectionType;");
methodVisitor.visitTypeInsn(NEW, "javax/persistence/metamodel/PluralAttribute$CollectionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MAP");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/persistence/metamodel/PluralAttribute$CollectionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/persistence/metamodel/PluralAttribute$CollectionType", "MAP", "Ljavax/persistence/metamodel/PluralAttribute$CollectionType;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/persistence/metamodel/PluralAttribute$CollectionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/metamodel/PluralAttribute$CollectionType", "COLLECTION", "Ljavax/persistence/metamodel/PluralAttribute$CollectionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/metamodel/PluralAttribute$CollectionType", "SET", "Ljavax/persistence/metamodel/PluralAttribute$CollectionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/metamodel/PluralAttribute$CollectionType", "LIST", "Ljavax/persistence/metamodel/PluralAttribute$CollectionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/metamodel/PluralAttribute$CollectionType", "MAP", "Ljavax/persistence/metamodel/PluralAttribute$CollectionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/persistence/metamodel/PluralAttribute$CollectionType", "$VALUES", "[Ljavax/persistence/metamodel/PluralAttribute$CollectionType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
