package asm.org.eclipse.persistence.jpa.config;
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
public class PersistenceUnitDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/jpa/config/PersistenceUnit", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addMappings", "()Lorg/eclipse/persistence/jpa/config/Mappings;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClassLoader", "()Ljava/lang/ClassLoader;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPersistenceUnitInfo", "()Ljavax/persistence/spi/PersistenceUnitInfo;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setClass", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/PersistenceUnit;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setExcludeUnlistedClasses", "(Ljava/lang/Boolean;)Lorg/eclipse/persistence/jpa/config/PersistenceUnit;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setJarFile", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/PersistenceUnit;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setJtaDataSource", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/PersistenceUnit;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMappingFile", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/PersistenceUnit;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setName", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/PersistenceUnit;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setNonJtaDataSource", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/PersistenceUnit;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/eclipse/persistence/jpa/config/PersistenceUnit;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setProvider", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/PersistenceUnit;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setSharedCacheMode", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/PersistenceUnit;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setTransactionType", "(Ljavax/persistence/spi/PersistenceUnitTransactionType;)Lorg/eclipse/persistence/jpa/config/PersistenceUnit;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setValidationMode", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/PersistenceUnit;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
