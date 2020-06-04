package asm.org.apache.openejb.resource.jdbc.pool;
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
public class DataSourceCreatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/resource/jdbc/pool/DataSourceCreator", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "managed", "(Ljava/lang/String;Ljavax/sql/CommonDataSource;)Ljavax/sql/DataSource;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "poolManaged", "(Ljava/lang/String;Ljavax/sql/DataSource;Ljava/util/Properties;)Ljavax/sql/DataSource;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pool", "(Ljava/lang/String;Ljavax/sql/DataSource;Ljava/util/Properties;)Ljavax/sql/DataSource;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "poolManagedWithRecovery", "(Ljava/lang/String;Lorg/apache/openejb/resource/XAResourceWrapper;Ljava/lang/String;Ljava/util/Properties;)Ljavax/sql/DataSource;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "poolManaged", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Properties;)Ljavax/sql/DataSource;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pool", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Properties;)Ljavax/sql/CommonDataSource;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "destroy", "(Ljava/lang/Object;)V", null, new String[] { "java/lang/Throwable" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "clearRecipe", "(Ljava/lang/Object;)Lorg/apache/xbean/recipe/ObjectRecipe;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
