package asm.com.sun.faces.facelets.tag;
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
public class AbstractTagLibrary$ConverterHandlerFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/facelets/tag/AbstractTagLibrary$ConverterHandlerFactory", null, "java/lang/Object", new String[] { "com/sun/faces/facelets/tag/TagHandlerFactory" });

classWriter.visitInnerClass("com/sun/faces/facelets/tag/AbstractTagLibrary$ConverterHandlerFactory", "com/sun/faces/facelets/tag/AbstractTagLibrary", "ConverterHandlerFactory", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/AbstractTagLibrary$ConverterConfigWrapper", "com/sun/faces/facelets/tag/AbstractTagLibrary", "ConverterConfigWrapper", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "converterId", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/AbstractTagLibrary$ConverterHandlerFactory", "converterId", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createHandler", "(Ljakarta/faces/view/facelets/TagConfig;)Ljakarta/faces/view/facelets/TagHandler;", null, new String[] { "jakarta/faces/FacesException", "jakarta/el/ELException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/view/facelets/ConverterHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/AbstractTagLibrary$ConverterConfigWrapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/AbstractTagLibrary$ConverterHandlerFactory", "converterId", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/AbstractTagLibrary$ConverterConfigWrapper", "<init>", "(Ljakarta/faces/view/facelets/TagConfig;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/view/facelets/ConverterHandler", "<init>", "(Ljakarta/faces/view/facelets/ConverterConfig;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
