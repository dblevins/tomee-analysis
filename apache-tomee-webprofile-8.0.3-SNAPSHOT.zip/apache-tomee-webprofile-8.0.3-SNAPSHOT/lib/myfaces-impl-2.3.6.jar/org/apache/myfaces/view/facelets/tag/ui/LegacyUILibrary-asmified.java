package asm.org.apache.myfaces.view.facelets.tag.ui;
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
public class LegacyUILibraryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/myfaces/view/facelets/tag/ui/LegacyUILibrary", null, "org/apache/myfaces/view/facelets/tag/AbstractTagLibrary", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAMESPACE", "Ljava/lang/String;", null, "http://xmlns.jcp.org/jsf/facelets");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALIAS_NAMESPACE", "Ljava/lang/String;", null, "http://java.sun.com/jsf/facelets");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSTANCE", "Lorg/apache/myfaces/view/facelets/tag/ui/LegacyUILibrary;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http://xmlns.jcp.org/jsf/facelets");
methodVisitor.visitLdcInsn("http://java.sun.com/jsf/facelets");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/tag/AbstractTagLibrary", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("component");
methodVisitor.visitLdcInsn("facelets.ui.ComponentRef");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/view/facelets/tag/ui/ComponentRefHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/tag/ui/LegacyUILibrary", "addComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("fragment");
methodVisitor.visitLdcInsn("facelets.ui.ComponentRef");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/view/facelets/tag/ui/ComponentRefHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/tag/ui/LegacyUILibrary", "addComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("define");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/view/facelets/tag/ui/DefineHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/tag/ui/LegacyUILibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("insert");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/view/facelets/tag/ui/InsertHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/tag/ui/LegacyUILibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("include");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/view/facelets/tag/ui/LegacyIncludeHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/tag/ui/LegacyUILibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("composition");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/view/facelets/tag/ui/LegacyCompositionHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/tag/ui/LegacyUILibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("param");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/view/facelets/tag/ui/LegacyParamHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/tag/ui/LegacyUILibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("decorate");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/view/facelets/tag/ui/LegacyDecorateHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/tag/ui/LegacyUILibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("repeat");
methodVisitor.visitLdcInsn("facelets.ui.Repeat");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/view/facelets/tag/ui/RepeatHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/tag/ui/LegacyUILibrary", "addComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("debug");
methodVisitor.visitLdcInsn("facelets.ui.Debug");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/tag/ui/LegacyUILibrary", "addComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/tag/ui/LegacyUILibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/tag/ui/LegacyUILibrary", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/tag/ui/LegacyUILibrary", "INSTANCE", "Lorg/apache/myfaces/view/facelets/tag/ui/LegacyUILibrary;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
