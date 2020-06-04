package asm.com.sun.faces.application;
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
public class NavigationHandlerImpl$NavigationMap$3Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/application/NavigationHandlerImpl$NavigationMap$3", "Ljava/util/AbstractCollection<Ljava/util/Set<Ljavax/faces/application/NavigationCase;>;>;", "java/util/AbstractCollection", null);

classWriter.visitOuterClass("com/sun/faces/application/NavigationHandlerImpl$NavigationMap", "values", "()Ljava/util/Collection;");

classWriter.visitInnerClass("com/sun/faces/application/NavigationHandlerImpl$NavigationMap", "com/sun/faces/application/NavigationHandlerImpl", "NavigationMap", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/application/NavigationHandlerImpl$NavigationMap$3", null, null, 0);

classWriter.visitInnerClass("com/sun/faces/application/NavigationHandlerImpl$NavigationMap$3$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/faces/application/NavigationHandlerImpl$NavigationMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/faces/application/NavigationHandlerImpl$NavigationMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/NavigationHandlerImpl$NavigationMap$3", "this$0", "Lcom/sun/faces/application/NavigationHandlerImpl$NavigationMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/AbstractCollection", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Ljava/util/Set<Ljavax/faces/application/NavigationCase;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/NavigationHandlerImpl$NavigationMap$3$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/NavigationHandlerImpl$NavigationMap$3$1", "<init>", "(Lcom/sun/faces/application/NavigationHandlerImpl$NavigationMap$3;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/NavigationHandlerImpl$NavigationMap$3", "this$0", "Lcom/sun/faces/application/NavigationHandlerImpl$NavigationMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/NavigationHandlerImpl$NavigationMap", "size", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
