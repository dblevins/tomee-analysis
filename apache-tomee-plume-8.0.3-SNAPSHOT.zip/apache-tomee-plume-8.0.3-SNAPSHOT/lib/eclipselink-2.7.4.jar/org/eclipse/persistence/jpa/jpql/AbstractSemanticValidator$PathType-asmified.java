package asm.org.eclipse.persistence.jpa.jpql;
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
public class AbstractSemanticValidator$PathTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "Ljava/lang/Enum<Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator", "PathType", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ANY_FIELD", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ANY_FIELD_INCLUDING_COLLECTION", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASSOCIATION_FIELD_ONLY", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BASIC_FIELD_ONLY", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "ENUM$VALUES", "[Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ANY_FIELD");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "ANY_FIELD", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ANY_FIELD_INCLUDING_COLLECTION");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "ANY_FIELD_INCLUDING_COLLECTION", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASSOCIATION_FIELD_ONLY");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "ASSOCIATION_FIELD_ONLY", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BASIC_FIELD_ONLY");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "BASIC_FIELD_ONLY", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "ANY_FIELD", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "ANY_FIELD_INCLUDING_COLLECTION", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "ASSOCIATION_FIELD_ONLY", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "BASIC_FIELD_ONLY", "Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "ENUM$VALUES", "[Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType", "ENUM$VALUES", "[Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$PathType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
