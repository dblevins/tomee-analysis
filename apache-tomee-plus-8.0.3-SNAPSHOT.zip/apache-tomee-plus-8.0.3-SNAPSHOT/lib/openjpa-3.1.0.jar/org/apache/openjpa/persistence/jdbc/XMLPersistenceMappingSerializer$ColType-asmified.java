package asm.org.apache.openjpa.persistence.jdbc;
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
public class XMLPersistenceMappingSerializer$ColTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "Ljava/lang/Enum<Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer", "ColType", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COL", "Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JOIN", "Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVERSE", "Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PK_JOIN", "Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DISC", "Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "$VALUES", "[Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COL");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "COL", "Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JOIN");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "JOIN", "Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVERSE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "INVERSE", "Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PK_JOIN");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "PK_JOIN", "Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DISC");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "DISC", "Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "COL", "Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "JOIN", "Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "INVERSE", "Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "PK_JOIN", "Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "DISC", "Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType", "$VALUES", "[Lorg/apache/openjpa/persistence/jdbc/XMLPersistenceMappingSerializer$ColType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
