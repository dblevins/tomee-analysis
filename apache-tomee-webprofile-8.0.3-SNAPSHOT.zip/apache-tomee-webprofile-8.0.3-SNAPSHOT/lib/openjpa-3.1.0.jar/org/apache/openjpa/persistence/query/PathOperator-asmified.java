package asm.org.apache.openjpa.persistence.query;
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
public class PathOperatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openjpa/persistence/query/PathOperator", "Ljava/lang/Enum<Lorg/apache/openjpa/persistence/query/PathOperator;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NONE", "Lorg/apache/openjpa/persistence/query/PathOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INNER", "Lorg/apache/openjpa/persistence/query/PathOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OUTER", "Lorg/apache/openjpa/persistence/query/PathOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FETCH_INNER", "Lorg/apache/openjpa/persistence/query/PathOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FETCH_OUTER", "Lorg/apache/openjpa/persistence/query/PathOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NAVIGATION", "Lorg/apache/openjpa/persistence/query/PathOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KEY", "Lorg/apache/openjpa/persistence/query/PathOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ROOT", "Lorg/apache/openjpa/persistence/query/PathOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VALUE", "Lorg/apache/openjpa/persistence/query/PathOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENTRY", "Lorg/apache/openjpa/persistence/query/PathOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_symbol", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openjpa/persistence/query/PathOperator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openjpa/persistence/query/PathOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "$VALUES", "[Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openjpa/persistence/query/PathOperator;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/PathOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/persistence/query/PathOperator;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/query/PathOperator");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/query/PathOperator", "_symbol", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/query/PathOperator", "_symbol", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/PathOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NONE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/PathOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "NONE", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/PathOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INNER");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(" JOIN ");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/PathOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "INNER", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/PathOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OUTER");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn(" LEFT JOIN ");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/PathOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "OUTER", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/PathOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FETCH_INNER");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn(" JOIN FETCH ");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/PathOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "FETCH_INNER", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/PathOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FETCH_OUTER");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn(" LEFT JOIN FETCH ");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/PathOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "FETCH_OUTER", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/PathOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NAVIGATION");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn(".");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/PathOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "NAVIGATION", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/PathOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KEY");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("KEY");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/PathOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "KEY", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/PathOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ROOT");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/PathOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "ROOT", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/PathOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VALUE");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("VALUE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/PathOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "VALUE", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/PathOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENTRY");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("ENTRY");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/PathOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "ENTRY", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/persistence/query/PathOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "NONE", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "INNER", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "OUTER", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "FETCH_INNER", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "FETCH_OUTER", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "NAVIGATION", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "KEY", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "ROOT", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "VALUE", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "ENTRY", "Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/PathOperator", "$VALUES", "[Lorg/apache/openjpa/persistence/query/PathOperator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
