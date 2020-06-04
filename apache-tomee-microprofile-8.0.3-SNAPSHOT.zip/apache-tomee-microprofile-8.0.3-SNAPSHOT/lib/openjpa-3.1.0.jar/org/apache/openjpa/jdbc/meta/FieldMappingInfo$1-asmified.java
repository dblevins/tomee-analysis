package asm.org.apache.openjpa.jdbc.meta;
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
public class FieldMappingInfo$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/jdbc/meta/FieldMappingInfo$1", null, "java/lang/Object", new String[] { "org/apache/openjpa/jdbc/meta/MappingInfo$TableDefaults" });

classWriter.visitOuterClass("org/apache/openjpa/jdbc/meta/FieldMappingInfo", "getTable", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;ZZ)Lorg/apache/openjpa/jdbc/schema/Table;");

classWriter.visitInnerClass("org/apache/openjpa/jdbc/meta/FieldMappingInfo$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openjpa/jdbc/meta/MappingInfo$TableDefaults", "org/apache/openjpa/jdbc/meta/MappingInfo", "TableDefaults", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/jdbc/meta/FieldMappingInfo;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openjpa/jdbc/meta/FieldMappingInfo;Lorg/apache/openjpa/jdbc/meta/FieldMapping;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/FieldMappingInfo$1", "this$0", "Lorg/apache/openjpa/jdbc/meta/FieldMappingInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/FieldMappingInfo$1", "val$field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Lorg/apache/openjpa/jdbc/schema/Schema;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/FieldMappingInfo$1", "val$field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/FieldMapping", "getMappingRepository", "()Lorg/apache/openjpa/jdbc/meta/MappingRepository;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/MappingRepository", "getMappingDefaults", "()Lorg/apache/openjpa/jdbc/meta/MappingDefaults;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/FieldMappingInfo$1", "val$field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/meta/MappingDefaults", "getTableName", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;Lorg/apache/openjpa/jdbc/schema/Schema;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIdentifier", "(Lorg/apache/openjpa/jdbc/schema/Schema;)Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/FieldMappingInfo$1", "val$field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/FieldMapping", "getMappingRepository", "()Lorg/apache/openjpa/jdbc/meta/MappingRepository;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/MappingRepository", "getMappingDefaults", "()Lorg/apache/openjpa/jdbc/meta/MappingDefaults;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/FieldMappingInfo$1", "val$field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/meta/MappingDefaults", "getTableIdentifier", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;Lorg/apache/openjpa/jdbc/schema/Schema;)Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
