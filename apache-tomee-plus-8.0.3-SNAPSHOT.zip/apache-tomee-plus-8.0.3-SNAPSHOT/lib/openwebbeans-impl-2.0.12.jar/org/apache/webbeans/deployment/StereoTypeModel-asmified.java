package asm.org.apache.webbeans.deployment;
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
public class StereoTypeModelDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/deployment/StereoTypeModel", null, "java/lang/Object", new String[] { "org/apache/webbeans/deployment/stereotype/IStereoTypeModel" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "defaultDeploymentType", "Ljava/lang/annotation/Annotation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "defaultScopeType", "Ljava/lang/annotation/Annotation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "interceptorBindingTypes", "Ljava/util/Set;", "Ljava/util/Set<Ljava/lang/annotation/Annotation;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "inherits", "Ljava/util/Set;", "Ljava/util/Set<Ljava/lang/annotation/Annotation;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "logger", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "named", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Ljava/lang/Class;)V", "(Lorg/apache/webbeans/config/WebBeansContext;Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getDeclaredAnnotations", "()[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/deployment/StereoTypeModel", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Ljava/lang/Class;[Ljava/lang/annotation/Annotation;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Ljava/lang/Class;[Ljava/lang/annotation/Annotation;)V", "(Lorg/apache/webbeans/config/WebBeansContext;Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;[Ljava/lang/annotation/Annotation;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "interceptorBindingTypes", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "inherits", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/deployment/StereoTypeModel", "configAnnotations", "(Ljava/lang/Class;Lorg/apache/webbeans/config/WebBeansContext;[Ljava/lang/annotation/Annotation;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_VARARGS, "configAnnotations", "(Ljava/lang/Class;Lorg/apache/webbeans/config/WebBeansContext;[Ljava/lang/annotation/Annotation;)V", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;Lorg/apache/webbeans/config/WebBeansContext;[Ljava/lang/annotation/Annotation;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/enterprise/inject/Typed;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/deployment/StereoTypeModel", "logger", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "WARNING", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/deployment/StereoTypeModel", "logger", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "WARNING", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("WARN_0016");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getAnnotationManager", "()Lorg/apache/webbeans/annotation/AnnotationManager;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/annotation/AnnotationManager", "getQualifierAnnotations", "([Ljava/lang/annotation/Annotation;)[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 8);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/webbeans/deployment/StereoTypeModel", "java/lang/Class", "org/apache/webbeans/config/WebBeansContext", "[Ljava/lang/annotation/Annotation;", "org/apache/webbeans/annotation/AnnotationManager", "[Ljava/lang/annotation/Annotation;", "[Ljava/lang/annotation/Annotation;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/annotation/Annotation", "annotationType", "()Ljava/lang/Class;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/enterprise/inject/Default;"));
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/annotation/Annotation"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/annotation/Annotation", "annotationType", "()Ljava/lang/Class;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/inject/Named;"));
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/deployment/StereoTypeModel", "logger", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "WARNING", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/deployment/StereoTypeModel", "logger", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "WARNING", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("WARN_0017");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/annotation/Annotation", "annotationType", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/logger/WebBeansLoggerFacade", "args", "([Ljava/lang/Object;)[Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "named", "Z");
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "named", "Z");
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(8, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/enterprise/context/NormalScope;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/util/AnnotationUtil", "hasMetaAnnotation", "([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/enterprise/context/NormalScope;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/util/AnnotationUtil", "getMetaAnnotations", "([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "defaultScopeType", "Ljava/lang/annotation/Annotation;");
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/inject/Scope;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/util/AnnotationUtil", "hasMetaAnnotation", "([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/inject/Scope;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/util/AnnotationUtil", "getMetaAnnotations", "([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "defaultScopeType", "Ljava/lang/annotation/Annotation;");
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/annotation/AnnotationManager", "hasInterceptorBindingMetaAnnotation", "([Ljava/lang/annotation/Annotation;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/annotation/AnnotationManager", "getInterceptorBindingMetaAnnotations", "([Ljava/lang/annotation/Annotation;)[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 9);
Label label9 = new Label();
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 10, new Object[] {"org/apache/webbeans/deployment/StereoTypeModel", "java/lang/Class", "org/apache/webbeans/config/WebBeansContext", "[Ljava/lang/annotation/Annotation;", "org/apache/webbeans/annotation/AnnotationManager", "[Ljava/lang/annotation/Annotation;", "[Ljava/lang/annotation/Annotation;", "[Ljava/lang/annotation/Annotation;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitJumpInsn(IF_ICMPGE, label8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "interceptorBindingTypes", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/webbeans/deployment/StereoTypeModel", "java/lang/Class", "org/apache/webbeans/config/WebBeansContext", "[Ljava/lang/annotation/Annotation;", "org/apache/webbeans/annotation/AnnotationManager", "[Ljava/lang/annotation/Annotation;"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/annotation/AnnotationManager", "hasStereoTypeMetaAnnotation", "([Ljava/lang/annotation/Annotation;)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/annotation/AnnotationManager", "getStereotypeMetaAnnotations", "([Ljava/lang/annotation/Annotation;)[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/annotation/Target;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/annotation/Target");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 10);
Label label11 = new Label();
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/apache/webbeans/deployment/StereoTypeModel", "java/lang/Class", "org/apache/webbeans/config/WebBeansContext", "[Ljava/lang/annotation/Annotation;", "org/apache/webbeans/annotation/AnnotationManager", "[Ljava/lang/annotation/Annotation;", "[Ljava/lang/annotation/Annotation;", "java/lang/annotation/Target", "[Ljava/lang/annotation/Annotation;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitJumpInsn(IF_ICMPGE, label10);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/annotation/Annotation", "annotationType", "()Ljava/lang/Class;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/annotation/Target;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/annotation/Target");
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/annotation/Target", "value", "()[Ljava/lang/annotation/ElementType;", true);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/annotation/Target", "value", "()[Ljava/lang/annotation/ElementType;", true);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ASTORE, 15);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 16);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 17);
Label label12 = new Label();
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_FULL, 18, new Object[] {"org/apache/webbeans/deployment/StereoTypeModel", "java/lang/Class", "org/apache/webbeans/config/WebBeansContext", "[Ljava/lang/annotation/Annotation;", "org/apache/webbeans/annotation/AnnotationManager", "[Ljava/lang/annotation/Annotation;", "[Ljava/lang/annotation/Annotation;", "java/lang/annotation/Target", "[Ljava/lang/annotation/Annotation;", Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/annotation/Annotation", "java/lang/annotation/Target", "[Ljava/lang/annotation/ElementType;", "[Ljava/lang/annotation/ElementType;", "[Ljava/lang/annotation/ElementType;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 17);
methodVisitor.visitVarInsn(ILOAD, 16);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label13);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitVarInsn(ILOAD, 17);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 18);
methodVisitor.visitVarInsn(ALOAD, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/annotation/ElementType", "METHOD", "Ljava/lang/annotation/ElementType;");
Label label14 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label14);
methodVisitor.visitVarInsn(ALOAD, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/annotation/ElementType", "FIELD", "Ljava/lang/annotation/ElementType;");
Label label15 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label15);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/annotation/ElementType"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitVarInsn(ASTORE, 19);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 20);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 21);
Label label16 = new Label();
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Ljava/lang/annotation/ElementType;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 21);
methodVisitor.visitVarInsn(ILOAD, 20);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label17);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitVarInsn(ILOAD, 21);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 22);
methodVisitor.visitVarInsn(ALOAD, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/annotation/ElementType", "TYPE", "Ljava/lang/annotation/ElementType;");
Label label18 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label18);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(IF_ICMPNE, label18);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/exception/WebBeansConfigurationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Inherited StereoType with class name : ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" must have compatible @Target annotation with Stereotype class name : ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/exception/WebBeansConfigurationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(21, 1);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
Label label19 = new Label();
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/annotation/ElementType", "TYPE", "Ljava/lang/annotation/ElementType;");
methodVisitor.visitJumpInsn(IF_ACMPNE, label19);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(IF_ICMPNE, label19);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitVarInsn(ASTORE, 19);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 20);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 21);
Label label20 = new Label();
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Ljava/lang/annotation/ElementType;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 21);
methodVisitor.visitVarInsn(ILOAD, 20);
methodVisitor.visitJumpInsn(IF_ICMPGE, label19);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitVarInsn(ILOAD, 21);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 22);
methodVisitor.visitVarInsn(ALOAD, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/annotation/ElementType", "METHOD", "Ljava/lang/annotation/ElementType;");
Label label21 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label21);
methodVisitor.visitVarInsn(ALOAD, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/annotation/ElementType", "FIELD", "Ljava/lang/annotation/ElementType;");
Label label22 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label22);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/annotation/ElementType"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/exception/WebBeansConfigurationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Inherited StereoType with class name : ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" must have compatible @Target annotation with Stereotype class name : ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/exception/WebBeansConfigurationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(21, 1);
methodVisitor.visitJumpInsn(GOTO, label20);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_FULL, 18, new Object[] {"org/apache/webbeans/deployment/StereoTypeModel", "java/lang/Class", "org/apache/webbeans/config/WebBeansContext", "[Ljava/lang/annotation/Annotation;", "org/apache/webbeans/annotation/AnnotationManager", "[Ljava/lang/annotation/Annotation;", "[Ljava/lang/annotation/Annotation;", "java/lang/annotation/Target", "[Ljava/lang/annotation/Annotation;", Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/annotation/Annotation", "java/lang/annotation/Target", "[Ljava/lang/annotation/ElementType;", "[Ljava/lang/annotation/ElementType;", "[Ljava/lang/annotation/ElementType;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitIincInsn(17, 1);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "inherits", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(10, 1);
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/webbeans/deployment/StereoTypeModel", "java/lang/Class", "org/apache/webbeans/config/WebBeansContext", "[Ljava/lang/annotation/Annotation;", "org/apache/webbeans/annotation/AnnotationManager", "[Ljava/lang/annotation/Annotation;"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 23);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultDeploymentType", "()Ljava/lang/annotation/Annotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "defaultDeploymentType", "Ljava/lang/annotation/Annotation;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultScopeType", "()Ljava/lang/annotation/Annotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "defaultScopeType", "Ljava/lang/annotation/Annotation;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInterceptorBindingTypes", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/annotation/Annotation;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "interceptorBindingTypes", "Ljava/util/Set;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInheritedStereoTypes", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/annotation/Annotation;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "inherits", "Ljava/util/Set;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/webbeans/deployment/StereoTypeModel");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/webbeans/deployment/StereoTypeModel");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "hashCode", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNamed", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/deployment/StereoTypeModel", "named", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/webbeans/deployment/StereoTypeModel;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/logger/WebBeansLoggerFacade", "getLogger", "(Ljava/lang/Class;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/deployment/StereoTypeModel", "logger", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
