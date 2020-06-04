package asm.org.apache.openejb.core.security.jacc;
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
public class BasicJaccProvider$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/core/security/jacc/BasicJaccProvider$1", "Ljava/util/HashSet<Ljava/lang/Class;>;", "java/util/HashSet", null);

classWriter.visitOuterClass("org/apache/openejb/core/security/jacc/BasicJaccProvider", null, null);

classWriter.visitInnerClass("org/apache/openejb/core/security/jacc/BasicJaccProvider$1", null, null, ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/security/jacc/EJBMethodPermission;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/security/jacc/BasicJaccProvider$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/security/jacc/EJBRoleRefPermission;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/security/jacc/BasicJaccProvider$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/security/jacc/WebResourcePermission;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/security/jacc/BasicJaccProvider$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/security/jacc/WebRoleRefPermission;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/security/jacc/BasicJaccProvider$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/security/jacc/WebUserDataPermission;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/security/jacc/BasicJaccProvider$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
