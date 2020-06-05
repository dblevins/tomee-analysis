package asm.org.apache.openejb.assembler.classic;
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
public class PersistenceBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/assembler/classic/PersistenceBuilder", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "logger", "Lorg/apache/openejb/util/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "persistenceClassLoaderHandler", "Lorg/apache/openejb/persistence/PersistenceClassLoaderHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/persistence/PersistenceClassLoaderHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/PersistenceBuilder", "persistenceClassLoaderHandler", "Lorg/apache/openejb/persistence/PersistenceClassLoaderHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEntityManagerFactory", "(Lorg/apache/openejb/assembler/classic/PersistenceUnitInfo;Ljava/lang/ClassLoader;Ljava/util/Map;Z)Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;", "(Lorg/apache/openejb/assembler/classic/PersistenceUnitInfo;Ljava/lang/ClassLoader;Ljava/util/Map<Lorg/apache/openejb/assembler/classic/ComparableValidationConfig;Ljakarta/validation/ValidatorFactory;>;Z)Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/naming/NamingException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "javax/naming/NamingException");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "javax/naming/NamingException");
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label9, label10, label11, "javax/naming/NamingException");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/PersistenceUnitInfoImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/PersistenceBuilder", "persistenceClassLoaderHandler", "Lorg/apache/openejb/persistence/PersistenceClassLoaderHandler;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "<init>", "(Lorg/apache/openejb/persistence/PersistenceClassLoaderHandler;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "id", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setPersistenceUnitName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "provider", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setPersistenceProviderClassName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "excludeUnlistedClasses", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setExcludeUnlistedClasses", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "webappName", "Ljava/lang/String;");
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label12);
methodVisitor.visitLdcInsn("true");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "properties", "Ljava/util/Properties;");
methodVisitor.visitLdcInsn("tomee.jpa.factory.lazy");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/SystemInstance", "get", "()Lorg/apache/openejb/loader/SystemInstance;", false);
methodVisitor.visitLdcInsn("tomee.jpa.factory.lazy");
methodVisitor.visitLdcInsn("false");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/SystemInstance", "getProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "getProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openejb/assembler/classic/PersistenceBuilder", "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "java/lang/ClassLoader", "java/util/Map", Opcodes.INTEGER, "org/apache/openejb/persistence/PersistenceUnitInfoImpl"}, 1, new Object[] {"org/apache/openejb/persistence/PersistenceUnitInfoImpl"});
methodVisitor.visitInsn(ICONST_1);
Label label14 = new Label();
methodVisitor.visitJumpInsn(GOTO, label14);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/persistence/PersistenceUnitInfoImpl"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openejb/assembler/classic/PersistenceBuilder", "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "java/lang/ClassLoader", "java/util/Map", Opcodes.INTEGER, "org/apache/openejb/persistence/PersistenceUnitInfoImpl"}, 2, new Object[] {"org/apache/openejb/persistence/PersistenceUnitInfoImpl", Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setLazilyInitialized", "(Z)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/SystemInstance", "get", "()Lorg/apache/openejb/loader/SystemInstance;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/spi/ContainerSystem;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/SystemInstance", "getComponent", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/spi/ContainerSystem");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/spi/ContainerSystem", "getJNDIContext", "()Ljavax/naming/Context;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "jtaDataSource", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setJtaDataSourceName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label15);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/SystemInstance", "get", "()Lorg/apache/openejb/loader/SystemInstance;", false);
methodVisitor.visitLdcInsn("openejb.geronimo");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/SystemInstance", "hasProperty", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label15);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("java:openejb/Resource/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFNE, label16);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("openejb/Resource/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label16);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("openejb/Resource/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"javax/naming/Context", "java/lang/String", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "lookup", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/sql/CommonDataSource");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setJtaDataSource", "(Ljavax/sql/CommonDataSource;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/naming/NamingException"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "javax/naming/InitialContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/naming/InitialContext", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/naming/InitialContext", "lookup", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/sql/DataSource");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setJtaDataSource", "(Ljavax/sql/CommonDataSource;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 10, new Object[] {"org/apache/openejb/assembler/classic/PersistenceBuilder", "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "java/lang/ClassLoader", "java/util/Map", Opcodes.INTEGER, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "javax/naming/Context", "java/lang/String", "java/lang/String", "javax/naming/NamingException"}, 1, new Object[] {"javax/naming/NamingException"});
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/OpenEJBException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Could not lookup <jta-data-source> '");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("' for unit '");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "getPersistenceUnitName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("'");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/OpenEJBException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "classes", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setManagedClassNames", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "mappingFiles", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setMappingFileNames", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "properties", "Ljava/util/Properties;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setProperties", "(Ljava/util/Properties;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "persistenceXMLSchemaVersion", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setPersistenceXMLSchemaVersion", "(Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/persistence/SharedCacheMode;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "sharedCacheMode", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/SharedCacheMode");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setSharedCacheMode", "(Ljakarta/persistence/SharedCacheMode;)V", false);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/persistence/ValidationMode;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "validationMode", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/ValidationMode");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setValidationMode", "(Ljakarta/persistence/ValidationMode;)V", false);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/persistence/spi/PersistenceUnitTransactionType;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "transactionType", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/spi/PersistenceUnitTransactionType");
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setTransactionType", "(Ljakarta/persistence/spi/PersistenceUnitTransactionType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "nonJtaDataSource", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setNonJtaDataSourceName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 11);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label17);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/SystemInstance", "get", "()Lorg/apache/openejb/loader/SystemInstance;", false);
methodVisitor.visitLdcInsn("openejb.geronimo");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/SystemInstance", "hasProperty", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label17);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitLdcInsn("java:openejb/Resource/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label18 = new Label();
methodVisitor.visitJumpInsn(IFNE, label18);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("java:openejb/Resource/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_FULL, 13, new Object[] {"org/apache/openejb/assembler/classic/PersistenceBuilder", "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "java/lang/ClassLoader", "java/util/Map", Opcodes.INTEGER, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "javax/naming/Context", "java/lang/String", "jakarta/persistence/SharedCacheMode", "jakarta/persistence/ValidationMode", "jakarta/persistence/spi/PersistenceUnitTransactionType", "java/lang/String", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/Context", "lookup", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/sql/CommonDataSource");
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setNonJtaDataSource", "(Ljavax/sql/CommonDataSource;)V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitJumpInsn(GOTO, label17);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/naming/NamingException"});
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "javax/naming/InitialContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/naming/InitialContext", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/naming/InitialContext", "lookup", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/sql/DataSource");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setNonJtaDataSource", "(Ljavax/sql/CommonDataSource;)V", false);
methodVisitor.visitLabel(label10);
methodVisitor.visitJumpInsn(GOTO, label17);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_FULL, 14, new Object[] {"org/apache/openejb/assembler/classic/PersistenceBuilder", "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "java/lang/ClassLoader", "java/util/Map", Opcodes.INTEGER, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "javax/naming/Context", "java/lang/String", "jakarta/persistence/SharedCacheMode", "jakarta/persistence/ValidationMode", "jakarta/persistence/spi/PersistenceUnitTransactionType", "java/lang/String", "java/lang/String", "javax/naming/NamingException"}, 1, new Object[] {"javax/naming/NamingException"});
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/OpenEJBException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Could not lookup <non-jta-data-source> '");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("' for unit '");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "getPersistenceUnitName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("'");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/OpenEJBException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "persistenceUnitRootUrl", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/PersistenceUnitInfo", "jarFiles", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setRootUrlAndJarUrls", "(Ljava/lang/String;Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "getPersistenceProviderClassName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "setPersistenceProviderClassName", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/EntityManagerFactoryCallable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/EntityManagerFactoryCallable", "<init>", "(Ljava/lang/String;Lorg/apache/openejb/persistence/PersistenceUnitInfoImpl;Ljava/lang/ClassLoader;Ljava/util/Map;Z)V", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "<init>", "(Ljava/lang/ClassLoader;Lorg/apache/openejb/assembler/classic/EntityManagerFactoryCallable;Lorg/apache/openejb/persistence/PersistenceUnitInfoImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 15);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getOpenEJBJndiName", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("openejb/PersistenceUnit/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_STARTUP", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/assembler/classic/PersistenceBuilder;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Logger", "getInstance", "(Lorg/apache/openejb/util/LogCategory;Ljava/lang/Class;)Lorg/apache/openejb/util/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/PersistenceBuilder", "logger", "Lorg/apache/openejb/util/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}