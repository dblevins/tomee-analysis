package asm.org.apache.openejb.resource.jdbc;
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
public class DataSourceFactory$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/resource/jdbc/DataSourceFactory$2", null, "org/apache/xbean/recipe/ObjectRecipe", null);

classWriter.visitOuterClass("org/apache/openejb/resource/jdbc/DataSourceFactory", "create", "(Ljava/lang/String;ZLjava/lang/Class;Ljava/lang/String;Lorg/apache/openejb/util/Duration;Lorg/apache/openejb/util/Duration;Lorg/apache/openejb/util/Duration;Z)Ljavax/sql/CommonDataSource;");

classWriter.visitInnerClass("org/apache/openejb/resource/jdbc/DataSourceFactory$2", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$props", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/Class;Ljava/util/Map;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/jdbc/DataSourceFactory$2", "val$props", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/recipe/ObjectRecipe", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/recipe/Option", "CASE_INSENSITIVE_PROPERTIES", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/jdbc/DataSourceFactory$2", "allow", "(Lorg/apache/xbean/recipe/Option;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/recipe/Option", "IGNORE_MISSING_PROPERTIES", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/jdbc/DataSourceFactory$2", "allow", "(Lorg/apache/xbean/recipe/Option;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/recipe/Option", "NAMED_PARAMETERS", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/jdbc/DataSourceFactory$2", "allow", "(Lorg/apache/xbean/recipe/Option;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/recipe/Option", "PRIVATE_PROPERTIES", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/jdbc/DataSourceFactory$2", "allow", "(Lorg/apache/xbean/recipe/Option;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/jdbc/DataSourceFactory$2", "val$props", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/jdbc/DataSourceFactory$2", "setAllProperties", "(Ljava/util/Map;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
