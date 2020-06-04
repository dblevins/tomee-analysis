package asm.org.apache.cxf.bus.extension;
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
public class ExtensionManagerBus$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/bus/extension/ExtensionManagerBus$1", null, "java/lang/Object", new String[] { "org/apache/cxf/resource/ResourceResolver" });

classWriter.visitOuterClass("org/apache/cxf/bus/extension/ExtensionManagerBus", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/ClassLoader;)V");

classWriter.visitInnerClass("org/apache/cxf/bus/extension/ExtensionManagerBus$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/bus/extension/ExtensionManagerBus;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/bus/extension/ExtensionManagerBus;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/extension/ExtensionManagerBus$1", "this$0", "Lorg/apache/cxf/bus/extension/ExtensionManagerBus;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resolve", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/extension/ExtensionManagerBus$1", "this$0", "Lorg/apache/cxf/bus/extension/ExtensionManagerBus;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/bus/extension/ExtensionManagerBus", "access$000", "(Lorg/apache/cxf/bus/extension/ExtensionManagerBus;)Lorg/apache/cxf/bus/extension/ExtensionManagerImpl;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/extension/ExtensionManagerBus$1", "this$0", "Lorg/apache/cxf/bus/extension/ExtensionManagerBus;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/bus/extension/ExtensionManagerBus", "access$000", "(Lorg/apache/cxf/bus/extension/ExtensionManagerBus;)Lorg/apache/cxf/bus/extension/ExtensionManagerImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/bus/extension/ExtensionManagerImpl", "getExtension", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAsStream", "(Ljava/lang/String;)Ljava/io/InputStream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
