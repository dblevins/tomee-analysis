package asm.org.apache.openejb.config.rules;
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
public class CheckDependsOn$BeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/config/rules/CheckDependsOn$Bean", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/config/rules/CheckDependsOn$Bean", "org/apache/openejb/config/rules/CheckDependsOn", "Bean", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/rules/CheckDependsOn$Resolver", "org/apache/openejb/config/rules/CheckDependsOn", "Resolver", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "moduleUri", "Ljava/net/URI;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "bean", "Lorg/apache/openejb/jee/EnterpriseBean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "dependsOn", "Ljava/util/ArrayList;", "Ljava/util/ArrayList<Lorg/apache/openejb/config/rules/CheckDependsOn$Bean;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "module", "Lorg/apache/openejb/config/EjbModule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "resolver", "Lorg/apache/openejb/config/rules/CheckDependsOn$Resolver;", "Lorg/apache/openejb/config/rules/CheckDependsOn$Resolver<Lorg/apache/openejb/config/rules/CheckDependsOn$Bean;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/jee/EnterpriseBean;Lorg/apache/openejb/config/EjbModule;Ljava/net/URI;Lorg/apache/openejb/config/rules/CheckDependsOn$Resolver;)V", "(Lorg/apache/openejb/jee/EnterpriseBean;Lorg/apache/openejb/config/EjbModule;Ljava/net/URI;Lorg/apache/openejb/config/rules/CheckDependsOn$Resolver<Lorg/apache/openejb/config/rules/CheckDependsOn$Bean;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/rules/CheckDependsOn$Bean", "dependsOn", "Ljava/util/ArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/rules/CheckDependsOn$Bean", "bean", "Lorg/apache/openejb/jee/EnterpriseBean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/rules/CheckDependsOn$Bean", "module", "Lorg/apache/openejb/config/EjbModule;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/rules/CheckDependsOn$Bean", "moduleUri", "Ljava/net/URI;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/rules/CheckDependsOn$Bean", "resolver", "Lorg/apache/openejb/config/rules/CheckDependsOn$Resolver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resolveLink", "(Ljava/lang/String;)Lorg/apache/openejb/config/rules/CheckDependsOn$Bean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/rules/CheckDependsOn$Bean", "resolver", "Lorg/apache/openejb/config/rules/CheckDependsOn$Resolver;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/rules/CheckDependsOn$Bean", "moduleUri", "Ljava/net/URI;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/rules/CheckDependsOn$Resolver", "resolveLink", "(Ljava/lang/String;Ljava/net/URI;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/config/rules/CheckDependsOn$Bean");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/openejb/config/rules/CheckDependsOn$Bean;)Lorg/apache/openejb/jee/EnterpriseBean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/rules/CheckDependsOn$Bean", "bean", "Lorg/apache/openejb/jee/EnterpriseBean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/apache/openejb/config/rules/CheckDependsOn$Bean;)Lorg/apache/openejb/config/EjbModule;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/rules/CheckDependsOn$Bean", "module", "Lorg/apache/openejb/config/EjbModule;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/apache/openejb/config/rules/CheckDependsOn$Bean;)Ljava/util/ArrayList;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/rules/CheckDependsOn$Bean", "dependsOn", "Ljava/util/ArrayList;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
