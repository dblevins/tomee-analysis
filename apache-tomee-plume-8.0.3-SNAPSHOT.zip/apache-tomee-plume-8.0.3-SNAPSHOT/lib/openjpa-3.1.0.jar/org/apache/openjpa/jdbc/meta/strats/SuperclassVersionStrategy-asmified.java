package asm.org.apache.openjpa.jdbc.meta.strats;
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
public class SuperclassVersionStrategyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/jdbc/meta/strats/SuperclassVersionStrategy", null, "org/apache/openjpa/jdbc/meta/strats/AbstractVersionStrategy", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/AbstractVersionStrategy", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterLoad", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/SuperclassVersionStrategy", "vers", "Lorg/apache/openjpa/jdbc/meta/Version;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Version", "getClassMapping", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getPCSuperclassMapping", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getVersion", "()Lorg/apache/openjpa/jdbc/meta/Version;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Version", "afterLoad", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "checkVersion", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Z)Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/SuperclassVersionStrategy", "vers", "Lorg/apache/openjpa/jdbc/meta/Version;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Version", "getClassMapping", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getPCSuperclassMapping", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getVersion", "()Lorg/apache/openjpa/jdbc/meta/Version;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Version", "checkVersion", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Z)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compareVersion", "(Ljava/lang/Object;Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/SuperclassVersionStrategy", "vers", "Lorg/apache/openjpa/jdbc/meta/Version;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Version", "getClassMapping", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getPCSuperclassMapping", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getVersion", "()Lorg/apache/openjpa/jdbc/meta/Version;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Version", "compareVersion", "(Ljava/lang/Object;Ljava/lang/Object;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBulkUpdateValues", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/SuperclassVersionStrategy", "vers", "Lorg/apache/openjpa/jdbc/meta/Version;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Version", "getClassMapping", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getPCSuperclassMapping", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getVersion", "()Lorg/apache/openjpa/jdbc/meta/Version;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Version", "getBulkUpdateValues", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
