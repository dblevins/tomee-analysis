package asm.org.eclipse.persistence.jaxb;
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
public class ReflectionUtils$DeclaredConstructorsIODHDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/jaxb/ReflectionUtils$DeclaredConstructorsIODH", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/ReflectionUtils$DeclaredConstructorsIODH", "org/eclipse/persistence/jaxb/ReflectionUtils", "DeclaredConstructorsIODH", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/ReflectionUtils$DeclaredConstructorsIODH$1", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/ReflectionUtils$Predicate", "org/eclipse/persistence/jaxb/ReflectionUtils", "Predicate", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PREDICATE_ACTION", "Lorg/eclipse/persistence/jaxb/ReflectionUtils$Predicate;", "Lorg/eclipse/persistence/jaxb/ReflectionUtils$Predicate<[Ljava/lang/reflect/Constructor<*>;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/ReflectionUtils$DeclaredConstructorsIODH$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/ReflectionUtils$DeclaredConstructorsIODH$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/ReflectionUtils$DeclaredConstructorsIODH", "PREDICATE_ACTION", "Lorg/eclipse/persistence/jaxb/ReflectionUtils$Predicate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$0", "()Lorg/eclipse/persistence/jaxb/ReflectionUtils$Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/ReflectionUtils$DeclaredConstructorsIODH", "PREDICATE_ACTION", "Lorg/eclipse/persistence/jaxb/ReflectionUtils$Predicate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
