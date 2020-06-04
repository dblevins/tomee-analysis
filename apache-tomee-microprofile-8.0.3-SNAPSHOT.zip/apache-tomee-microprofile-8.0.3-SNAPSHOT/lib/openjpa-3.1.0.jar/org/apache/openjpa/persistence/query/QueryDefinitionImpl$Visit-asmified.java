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
public class QueryDefinitionImpl$VisitDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit", "Ljava/lang/Enum<Lorg/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit", "org/apache/openjpa/persistence/query/QueryDefinitionImpl", "Visit", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PROJECTION", "Lorg/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXPRESSION", "Lorg/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JOINABLE", "Lorg/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit", "$VALUES", "[Lorg/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PROJECTION");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit", "PROJECTION", "Lorg/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXPRESSION");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit", "EXPRESSION", "Lorg/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JOINABLE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit", "JOINABLE", "Lorg/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit", "PROJECTION", "Lorg/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit", "EXPRESSION", "Lorg/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit", "JOINABLE", "Lorg/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit", "$VALUES", "[Lorg/apache/openjpa/persistence/query/QueryDefinitionImpl$Visit;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
