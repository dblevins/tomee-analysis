package asm.com.sun.faces.config.manager.tasks;
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
public class FindAnnotatedConfigClassesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/config/manager/tasks/FindAnnotatedConfigClasses", "Ljava/lang/Object;Ljava/util/concurrent/Callable<Ljava/util/Map<Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;Ljava/util/Set<Ljava/lang/Class<*>;>;>;>;", "java/lang/Object", new String[] { "java/util/concurrent/Callable" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "facesContext", "Lcom/sun/faces/config/InitFacesContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "provider", "Lcom/sun/faces/spi/AnnotationProvider;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "metadataGetter", "Lcom/sun/faces/config/manager/tasks/ProvideMetadataToAnnotationScanTask;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "annotatedSet", "Ljava/util/Set;", "Ljava/util/Set<Ljava/lang/Class<*>;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/servlet/ServletContext;Lcom/sun/faces/config/InitFacesContext;Lcom/sun/faces/config/manager/tasks/ProvideMetadataToAnnotationScanTask;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/manager/tasks/FindAnnotatedConfigClasses", "facesContext", "Lcom/sun/faces/config/InitFacesContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/spi/AnnotationProviderFactory", "createAnnotationProvider", "(Ljakarta/servlet/ServletContext;)Lcom/sun/faces/spi/AnnotationProvider;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/manager/tasks/FindAnnotatedConfigClasses", "provider", "Lcom/sun/faces/spi/AnnotationProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/manager/tasks/FindAnnotatedConfigClasses", "metadataGetter", "Lcom/sun/faces/config/manager/tasks/ProvideMetadataToAnnotationScanTask;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("com.sun.faces.AnnotatedClasses");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletContext", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/manager/tasks/FindAnnotatedConfigClasses", "annotatedSet", "Ljava/util/Set;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "call", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;Ljava/util/Set<Ljava/lang/Class<*>;>;>;", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/Timer", "getInstance", "()Lcom/sun/faces/util/Timer;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/util/Timer", "startTiming", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/faces/util/Timer"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/manager/tasks/FindAnnotatedConfigClasses", "facesContext", "Lcom/sun/faces/config/InitFacesContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/InitFacesContext", "addInitContextEntryForCurrentThread", "()V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/manager/tasks/FindAnnotatedConfigClasses", "metadataGetter", "Lcom/sun/faces/config/manager/tasks/ProvideMetadataToAnnotationScanTask;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/manager/tasks/ProvideMetadataToAnnotationScanTask", "getAnnotationScanner", "()Lcom/sun/faces/spi/AnnotationScanner;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/manager/tasks/FindAnnotatedConfigClasses", "provider", "Lcom/sun/faces/spi/AnnotationProvider;");
methodVisitor.visitTypeInsn(INSTANCEOF, "com/sun/faces/config/manager/spi/FilterClassesFromFacesInitializerAnnotationProvider");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/manager/tasks/FindAnnotatedConfigClasses", "provider", "Lcom/sun/faces/spi/AnnotationProvider;");
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/config/manager/spi/FilterClassesFromFacesInitializerAnnotationProvider");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/manager/tasks/FindAnnotatedConfigClasses", "metadataGetter", "Lcom/sun/faces/config/manager/tasks/ProvideMetadataToAnnotationScanTask;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/manager/tasks/FindAnnotatedConfigClasses", "annotatedSet", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/manager/tasks/ProvideMetadataToAnnotationScanTask", "getJarNames", "(Ljava/util/Set;)Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/manager/spi/FilterClassesFromFacesInitializerAnnotationProvider", "setAnnotationScanner", "(Lcom/sun/faces/spi/AnnotationScanner;Ljava/util/Set;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Set", "com/sun/faces/spi/AnnotationScanner"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/manager/tasks/FindAnnotatedConfigClasses", "metadataGetter", "Lcom/sun/faces/config/manager/tasks/ProvideMetadataToAnnotationScanTask;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/manager/tasks/FindAnnotatedConfigClasses", "annotatedSet", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/manager/tasks/ProvideMetadataToAnnotationScanTask", "getAnnotationScanURIs", "(Ljava/util/Set;)Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/manager/tasks/FindAnnotatedConfigClasses", "provider", "Lcom/sun/faces/spi/AnnotationProvider;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/spi/AnnotationProvider", "getAnnotatedClasses", "(Ljava/util/Set;)Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/util/Timer", "stopTiming", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Configuration annotation scan complete.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/util/Timer", "logResult", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Map"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "call", "()Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/manager/tasks/FindAnnotatedConfigClasses", "call", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
