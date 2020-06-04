package asm.org.eclipse.persistence.internal.jpa.querydef;
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
public class AbstractQueryImpl$ResultTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "Ljava/lang/Enum<Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl", "ResultType", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNKNOWN", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OBJECT_ARRAY", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PARTIAL", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TUPLE", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENTITY", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONSTRUCTOR", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OTHER", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "ENUM$VALUES", "[Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNKNOWN");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "UNKNOWN", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OBJECT_ARRAY");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "OBJECT_ARRAY", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PARTIAL");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "PARTIAL", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TUPLE");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "TUPLE", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENTITY");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "ENTITY", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONSTRUCTOR");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "CONSTRUCTOR", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OTHER");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "OTHER", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "UNKNOWN", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "OBJECT_ARRAY", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "PARTIAL", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "TUPLE", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "ENTITY", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "CONSTRUCTOR", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "OTHER", "Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "ENUM$VALUES", "[Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType", "ENUM$VALUES", "[Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/querydef/AbstractQueryImpl$ResultType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
