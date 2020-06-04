package asm.org.apache.openjpa.persistence;
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
public class PersistenceProviderImpl$ClassTransformerImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/persistence/PersistenceProviderImpl$ClassTransformerImpl", null, "java/lang/Object", new String[] { "javax/persistence/spi/ClassTransformer" });

classWriter.visitInnerClass("org/apache/openjpa/persistence/PersistenceProviderImpl$ClassTransformerImpl", "org/apache/openjpa/persistence/PersistenceProviderImpl", "ClassTransformerImpl", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/PersistenceProviderImpl$ClassTransformerImpl$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openjpa/persistence/PersistenceProviderImpl$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_trans", "Ljava/lang/instrument/ClassFileTransformer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openjpa/lib/conf/ConfigurationProvider;Ljava/lang/String;Ljava/lang/ClassLoader;Lorg/apache/openjpa/conf/OpenJPAConfiguration;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/conf/ConfigurationProvider", "setInto", "(Lorg/apache/openjpa/lib/conf/Configuration;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/PersistenceProviderImpl$ClassTransformerImpl$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/PersistenceProviderImpl$ClassTransformerImpl$1", "<init>", "(Lorg/apache/openjpa/persistence/PersistenceProviderImpl$ClassTransformerImpl;Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/conf/OpenJPAConfiguration", "setClassResolver", "(Lorg/apache/openjpa/util/ClassResolver;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/conf/OpenJPAConfiguration", "setReadOnly", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/conf/OpenJPAConfiguration", "getMetaDataRepositoryInstance", "()Lorg/apache/openjpa/meta/MetaDataRepository;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/MetaDataRepository", "setResolve", "(IZ)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/enhance/PCClassFileTransformer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/conf/Configurations", "parseProperties", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/util/Options;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/enhance/PCClassFileTransformer", "<init>", "(Lorg/apache/openjpa/meta/MetaDataRepository;Lorg/apache/openjpa/lib/util/Options;Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/PersistenceProviderImpl$ClassTransformerImpl", "_trans", "Ljava/lang/instrument/ClassFileTransformer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "transform", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class<*>;Ljava/security/ProtectionDomain;[B)[B", new String[] { "java/lang/instrument/IllegalClassFormatException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/PersistenceProviderImpl$ClassTransformerImpl", "_trans", "Ljava/lang/instrument/ClassFileTransformer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/instrument/ClassFileTransformer", "transform", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openjpa/lib/conf/ConfigurationProvider;Ljava/lang/String;Ljava/lang/ClassLoader;Lorg/apache/openjpa/conf/OpenJPAConfiguration;Lorg/apache/openjpa/persistence/PersistenceProviderImpl$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/PersistenceProviderImpl$ClassTransformerImpl", "<init>", "(Lorg/apache/openjpa/lib/conf/ConfigurationProvider;Ljava/lang/String;Ljava/lang/ClassLoader;Lorg/apache/openjpa/conf/OpenJPAConfiguration;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
