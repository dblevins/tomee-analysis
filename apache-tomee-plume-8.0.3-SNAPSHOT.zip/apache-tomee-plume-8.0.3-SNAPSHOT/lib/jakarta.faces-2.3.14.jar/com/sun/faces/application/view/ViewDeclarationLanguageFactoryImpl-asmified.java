package asm.com.sun.faces.application.view;
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
public class ViewDeclarationLanguageFactoryImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/application/view/ViewDeclarationLanguageFactoryImpl", null, "jakarta/faces/view/ViewDeclarationLanguageFactory", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "viewHandlingStrategyManager", "Lcom/sun/faces/application/view/ViewHandlingStrategyManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "allViewDeclarationLanguages", "Ljava/util/List;", "Ljava/util/List<Ljakarta/faces/view/ViewDeclarationLanguage;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/view/ViewDeclarationLanguageFactory", "<init>", "(Ljakarta/faces/view/ViewDeclarationLanguageFactory;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getViewDeclarationLanguage", "(Ljava/lang/String;)Ljakarta/faces/view/ViewDeclarationLanguage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/view/ViewDeclarationLanguageFactoryImpl", "getViewHandlingStrategyManager", "()Lcom/sun/faces/application/view/ViewHandlingStrategyManager;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/view/ViewHandlingStrategyManager", "getStrategy", "(Ljava/lang/String;)Lcom/sun/faces/application/view/ViewHandlingStrategy;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAllViewDeclarationLanguages", "()Ljava/util/List;", "()Ljava/util/List<Ljakarta/faces/view/ViewDeclarationLanguage;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/view/ViewDeclarationLanguageFactoryImpl", "allViewDeclarationLanguages", "Ljava/util/List;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/view/ViewDeclarationLanguageFactoryImpl", "getViewHandlingStrategyManager", "()Lcom/sun/faces/application/view/ViewHandlingStrategyManager;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/view/ViewHandlingStrategyManager", "getViewHandlingStrategies", "()[Lcom/sun/faces/application/view/ViewHandlingStrategy;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/view/ViewDeclarationLanguageFactoryImpl", "allViewDeclarationLanguages", "Ljava/util/List;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/view/ViewDeclarationLanguageFactoryImpl", "allViewDeclarationLanguages", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getViewHandlingStrategyManager", "()Lcom/sun/faces/application/view/ViewHandlingStrategyManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/view/ViewDeclarationLanguageFactoryImpl", "viewHandlingStrategyManager", "Lcom/sun/faces/application/view/ViewHandlingStrategyManager;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/view/ViewHandlingStrategyManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/view/ViewHandlingStrategyManager", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/view/ViewDeclarationLanguageFactoryImpl", "viewHandlingStrategyManager", "Lcom/sun/faces/application/view/ViewHandlingStrategyManager;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/view/ViewDeclarationLanguageFactoryImpl", "viewHandlingStrategyManager", "Lcom/sun/faces/application/view/ViewHandlingStrategyManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
