package asm.org.eclipse.persistence.internal.libraries.asm.xml;
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
public class Processor$ASMContentHandlerFactory$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/eclipse/persistence/internal/libraries/asm/xml/Processor$ASMContentHandlerFactory$1", null, "org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler", null);

classWriter.visitOuterClass("org/eclipse/persistence/internal/libraries/asm/xml/Processor$ASMContentHandlerFactory", "createContentHandler", "()Lorg/xml/sax/ContentHandler;");

classWriter.visitInnerClass("org/eclipse/persistence/internal/libraries/asm/xml/Processor$ASMContentHandlerFactory", "org/eclipse/persistence/internal/libraries/asm/xml/Processor", "ASMContentHandlerFactory", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/libraries/asm/xml/Processor$ASMContentHandlerFactory$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$cw", "Lorg/eclipse/persistence/internal/libraries/asm/ClassWriter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/libraries/asm/xml/Processor$ASMContentHandlerFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/xml/Processor$ASMContentHandlerFactory;Lorg/eclipse/persistence/internal/libraries/asm/ClassVisitor;Lorg/eclipse/persistence/internal/libraries/asm/ClassWriter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/asm/xml/Processor$ASMContentHandlerFactory$1", "this$0", "Lorg/eclipse/persistence/internal/libraries/asm/xml/Processor$ASMContentHandlerFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/asm/xml/Processor$ASMContentHandlerFactory$1", "val$cw", "Lorg/eclipse/persistence/internal/libraries/asm/ClassWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler", "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/ClassVisitor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endDocument", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/xml/Processor$ASMContentHandlerFactory$1", "this$0", "Lorg/eclipse/persistence/internal/libraries/asm/xml/Processor$ASMContentHandlerFactory;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/xml/Processor$ASMContentHandlerFactory", "os", "Ljava/io/OutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/xml/Processor$ASMContentHandlerFactory$1", "val$cw", "Lorg/eclipse/persistence/internal/libraries/asm/ClassWriter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/ClassWriter", "toByteArray", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/OutputStream", "write", "([B)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/xml/sax/SAXException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/SAXException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
