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
public class ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/openejb/api/jmx/MBean;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/openejb/api/internal/Internal;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "represents a persistence unit managed by OpenEJB");
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "JMXReloadableEntityManagerFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "Info", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openejb/jee/Persistence$PersistenceUnit", "org/apache/openejb/jee/Persistence", "PersistenceUnit", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/jee/Persistence$PersistenceUnit$Properties", "org/apache/openejb/jee/Persistence$PersistenceUnit", "Properties", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/jee/Persistence$PersistenceUnit$Properties$Property", "org/apache/openejb/jee/Persistence$PersistenceUnit$Properties", "Property", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reload", "()V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedOperation;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "recreate the entity manager factory using new properties");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "reload", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProvider", "(Ljava/lang/String;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedOperation;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "change the current JPA provider");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "setProvider", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTransactionType", "(Ljava/lang/String;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedOperation;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "change the current transaction type");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toUpperCase", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/persistence/spi/PersistenceUnitTransactionType", "valueOf", "(Ljava/lang/String;)Ljakarta/persistence/spi/PersistenceUnitTransactionType;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "setTransactionType", "(Ljakarta/persistence/spi/PersistenceUnitTransactionType;)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProperty", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedOperation;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "create or modify a property of the persistence unit");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeProperty", "(Ljava/lang/String;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedOperation;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "remove a property of the persistence unit if it exists");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "removeProperty", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addMappingFile", "(Ljava/lang/String;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedOperation;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "add a mapping file");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "addMappingFile", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeMappingFile", "(Ljava/lang/String;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedOperation;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "remove a mapping file");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "removeMappingFile", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addManagedClass", "(Ljava/lang/String;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedOperation;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "add a managed class");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "addManagedClasses", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeManagedClass", "(Ljava/lang/String;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedOperation;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "remove a managed class");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "removeManagedClasses", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addJarFile", "(Ljava/lang/String;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedOperation;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "add a jar file");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "addJarFileUrls", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeJarFile", "(Ljava/lang/String;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedOperation;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "remove a jar file");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "removeJarFileUrls", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSharedCacheMode", "(Ljava/lang/String;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedOperation;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "change the shared cache mode if possible (value is ok)");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "trim", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toUpperCase", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "isEmpty", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/SharedCacheMode", "UNSPECIFIED", "Ljakarta/persistence/SharedCacheMode;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/persistence/SharedCacheMode", "valueOf", "(Ljava/lang/String;)Ljakarta/persistence/SharedCacheMode;", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/persistence/SharedCacheMode"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "setSharedCacheMode", "(Ljakarta/persistence/SharedCacheMode;)V", false);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "java/lang/String"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExcludeUnlistedClasses", "(Z)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedOperation;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "exclude or not unlisted entities");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "setExcludeUnlistedClasses", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValidationMode", "(Ljava/lang/String;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedOperation;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "change the validation mode if possible (value is ok)");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "trim", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toUpperCase", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/persistence/ValidationMode", "valueOf", "(Ljava/lang/String;)Ljakarta/persistence/ValidationMode;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "setValidationMode", "(Ljakarta/persistence/ValidationMode;)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "access$100", "()Lorg/apache/openejb/util/Logger;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Can't set validation mode ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger", "warning", "(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitLdcInsn("jakarta.persistence.validation.mode");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dump", "(Ljava/lang/String;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedOperation;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "dump the current configuration for this persistence unit in a file");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Throwable");
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label6, null);
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label7, label8, label9, "java/lang/Throwable");
Label label10 = new Label();
methodVisitor.visitTryCatchBlock(label5, label10, label6, null);
Label label11 = new Label();
Label label12 = new Label();
Label label13 = new Label();
methodVisitor.visitTryCatchBlock(label11, label12, label13, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "access$200", "(Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;)Lorg/apache/openejb/assembler/classic/EntityManagerFactoryCallable;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/EntityManagerFactoryCallable", "getUnitInfo", "()Lorg/apache/openejb/persistence/PersistenceUnitInfoImpl;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/Persistence$PersistenceUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/Persistence$PersistenceUnit", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "getJtaDataSourceName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence$PersistenceUnit", "setJtaDataSource", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "getNonJtaDataSourceName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence$PersistenceUnit", "setNonJtaDataSource", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence$PersistenceUnit", "getClazz", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "getManagedClassNames", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence$PersistenceUnit", "getMappingFile", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "getMappingFileNames", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "getPersistenceUnitName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence$PersistenceUnit", "setName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "getPersistenceProviderClassName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence$PersistenceUnit", "setProvider", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "getTransactionType", "()Ljakarta/persistence/spi/PersistenceUnitTransactionType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/persistence/spi/PersistenceUnitTransactionType", "name", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence$PersistenceUnit", "setTransactionType", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "excludeUnlistedClasses", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence$PersistenceUnit", "setExcludeUnlistedClasses", "(Ljava/lang/Boolean;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "getSharedCacheMode", "()Ljakarta/persistence/SharedCacheMode;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/persistence/SharedCacheMode", "name", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/jee/PersistenceUnitCaching", "fromValue", "(Ljava/lang/String;)Lorg/apache/openejb/jee/PersistenceUnitCaching;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence$PersistenceUnit", "setSharedCacheMode", "(Lorg/apache/openejb/jee/PersistenceUnitCaching;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "getValidationMode", "()Ljakarta/persistence/ValidationMode;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/persistence/ValidationMode", "name", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/jee/PersistenceUnitValidationMode", "fromValue", "(Ljava/lang/String;)Lorg/apache/openejb/jee/PersistenceUnitValidationMode;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence$PersistenceUnit", "setValidationMode", "(Lorg/apache/openejb/jee/PersistenceUnitValidationMode;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "getJarFileUrls", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label14 = new Label();
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/openejb/persistence/PersistenceUnitInfoImpl", "org/apache/openejb/jee/Persistence$PersistenceUnit", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label15);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/URL");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence$PersistenceUnit", "getJarFile", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label14);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "getProperties", "()Ljava/util/Properties;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "stringPropertyNames", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label16 = new Label();
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label17);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/Persistence$PersistenceUnit$Properties$Property");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/Persistence$PersistenceUnit$Properties$Property", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence$PersistenceUnit$Properties$Property", "setName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "getProperties", "()Ljava/util/Properties;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence$PersistenceUnit$Properties$Property", "setValue", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence$PersistenceUnit", "getProperties", "()Lorg/apache/openejb/jee/Persistence$PersistenceUnit$Properties;", false);
Label label18 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label18);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/Persistence$PersistenceUnit$Properties");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/Persistence$PersistenceUnit$Properties", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence$PersistenceUnit", "setProperties", "(Lorg/apache/openejb/jee/Persistence$PersistenceUnit$Properties;)V", false);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "org/apache/openejb/jee/Persistence$PersistenceUnit$Properties$Property"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence$PersistenceUnit", "getProperties", "()Lorg/apache/openejb/jee/Persistence$PersistenceUnit$Properties;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence$PersistenceUnit$Properties", "getProperty", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/Persistence");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/Persistence", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "getPersistenceXMLSchemaVersion", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence", "setVersion", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Persistence", "getPersistenceUnit", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label11);
methodVisitor.visitTypeInsn(NEW, "java/io/FileWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/FileWriter", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/Persistence;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/jee/JAXBContextFactory", "newInstance", "([Ljava/lang/Class;)Ljakarta/xml/bind/JAXBContext;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/bind/JAXBContext", "createMarshaller", "()Ljakarta/xml/bind/Marshaller;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLdcInsn("jaxb.formatted.output");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/bind/Marshaller", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/bind/Marshaller", "marshal", "(Ljava/lang/Object;Ljava/io/Writer;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label19);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/FileWriter", "close", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "java/lang/String", "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "org/apache/openejb/jee/Persistence$PersistenceUnit", "org/apache/openejb/jee/Persistence", "java/io/FileWriter", "java/lang/Throwable"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/FileWriter", "close", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label20 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label20);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label21 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label21);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/FileWriter", "close", "()V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitJumpInsn(GOTO, label20);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 10, new Object[] {"org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "java/lang/String", "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "org/apache/openejb/jee/Persistence$PersistenceUnit", "org/apache/openejb/jee/Persistence", "java/io/FileWriter", "java/lang/Throwable", Opcodes.TOP, Opcodes.TOP, "java/lang/Throwable"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label20);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/FileWriter", "close", "()V", false);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "java/lang/String", "org/apache/openejb/persistence/PersistenceUnitInfoImpl", "org/apache/openejb/jee/Persistence$PersistenceUnit", "org/apache/openejb/jee/Persistence"}, 0, new Object[] {});
Label label22 = new Label();
methodVisitor.visitJumpInsn(GOTO, label22);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "access$100", "()Lorg/apache/openejb/util/Logger;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("can't dump pu ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "access$300", "(Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" in file ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExcludeUnlistedClasses", "()Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedAttribute;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "get exclude unlisted classes");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "getExcludeUnlistedClasses", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProperties", "()Ljavax/management/openmbean/TabularData;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedAttribute;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "get all properties");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("properties");
methodVisitor.visitLdcInsn("properties type");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Property of ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "access$300", "(Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "getUnitProperties", "()Ljava/util/Properties;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/monitoring/LocalMBeanServer", "tabularData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Properties;)Ljavax/management/openmbean/TabularData;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMappingFiles", "()Ljavax/management/openmbean/TabularData;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedAttribute;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "get all mapping files");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("mappingfile");
methodVisitor.visitLdcInsn("mapping file type");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "getMappingFiles", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "FILE", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "buildTabularData", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;)Ljavax/management/openmbean/TabularData;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJarFiles", "()Ljavax/management/openmbean/TabularData;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedAttribute;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "get all jar files");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("jarfile");
methodVisitor.visitLdcInsn("jar file type");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "getJarFileUrls", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "URL", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "buildTabularData", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;)Ljavax/management/openmbean/TabularData;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getManagedClasses", "()Ljavax/management/openmbean/TabularData;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedAttribute;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "get all managed classes");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("managedclass");
methodVisitor.visitLdcInsn("managed class type");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "getManagedClasses", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "CLASS", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "buildTabularData", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;)Ljavax/management/openmbean/TabularData;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "buildTabularData", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;)Ljavax/management/openmbean/TabularData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List<*>;Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;)Ljavax/management/openmbean/TabularData;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "java/lang/String", "java/lang/String", "java/util/List", "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "[Ljava/lang/String;", "[Ljava/lang/Object;", Opcodes.INTEGER, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "reloadableEntityManagerFactory", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "access$400", "(Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory;)Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "info", "(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/monitoring/LocalMBeanServer", "tabularData", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/Object;)Ljavax/management/openmbean/TabularData;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 10);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
