package asm.org.apache.myfaces.view.facelets.tag;
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
public class AbstractTagLibrary$BehaviorHandlerFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/myfaces/view/facelets/tag/AbstractTagLibrary$BehaviorHandlerFactory", null, "java/lang/Object", new String[] { "org/apache/myfaces/view/facelets/tag/TagHandlerFactory" });

classWriter.visitInnerClass("org/apache/myfaces/view/facelets/tag/AbstractTagLibrary$BehaviorHandlerFactory", "org/apache/myfaces/view/facelets/tag/AbstractTagLibrary", "BehaviorHandlerFactory", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/myfaces/view/facelets/tag/AbstractTagLibrary$BehaviorConfigWrapper", "org/apache/myfaces/view/facelets/tag/AbstractTagLibrary", "BehaviorConfigWrapper", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "behaviorId", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/tag/AbstractTagLibrary$BehaviorHandlerFactory", "behaviorId", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createHandler", "(Ljakarta/faces/view/facelets/TagConfig;)Ljakarta/faces/view/facelets/TagHandler;", null, new String[] { "jakarta/faces/FacesException", "jakarta/el/ELException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/tag/AbstractTagLibrary$BehaviorConfigWrapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/tag/AbstractTagLibrary$BehaviorHandlerFactory", "behaviorId", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/tag/AbstractTagLibrary$BehaviorConfigWrapper", "<init>", "(Ljakarta/faces/view/facelets/TagConfig;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/view/facelets/BehaviorHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/view/facelets/BehaviorHandler", "<init>", "(Ljakarta/faces/view/facelets/BehaviorConfig;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
