package asm.org.apache.openejb.openjpa;
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
public class PrefixMappingRepositoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/openjpa/PrefixMappingRepository", null, "org/apache/openjpa/jdbc/meta/MappingRepository", null);

classWriter.visitInnerClass("org/apache/openejb/openjpa/PrefixMappingRepository$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/openejb/openjpa/PrefixMappingRepository$PrefixMappingDefaults", "org/apache/openejb/openjpa/PrefixMappingRepository", "PrefixMappingDefaults", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "prefix", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/MappingRepository", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/openjpa/PrefixMappingRepository$PrefixMappingDefaults");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/openjpa/PrefixMappingRepository$PrefixMappingDefaults", "<init>", "(Lorg/apache/openejb/openjpa/PrefixMappingRepository;Lorg/apache/openejb/openjpa/PrefixMappingRepository$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/openjpa/PrefixMappingRepository", "setMappingDefaults", "(Lorg/apache/openjpa/jdbc/meta/MappingDefaults;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPrefix", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/openjpa/PrefixMappingRepository", "prefix", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endConfiguration", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/MappingRepository", "endConfiguration", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/openjpa/PrefixMappingRepository", "getMappingDefaults", "()Lorg/apache/openjpa/jdbc/meta/MappingDefaults;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/openjpa/PrefixMappingRepository", "getConfiguration", "()Lorg/apache/openjpa/conf/OpenJPAConfiguration;", false);
methodVisitor.visitLdcInsn("jdbc.MappingDefaults");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/conf/Configurations", "configureInstance", "(Ljava/lang/Object;Lorg/apache/openjpa/lib/conf/Configuration;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/openjpa/PrefixMappingRepository", "getMappingDefaults", "()Lorg/apache/openjpa/jdbc/meta/MappingDefaults;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/openjpa/PrefixMappingRepository$PrefixMappingDefaults");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/openjpa/PrefixMappingRepository$PrefixMappingDefaults", "endConfiguration", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/openejb/openjpa/PrefixMappingRepository;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/openjpa/PrefixMappingRepository", "prefix", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
