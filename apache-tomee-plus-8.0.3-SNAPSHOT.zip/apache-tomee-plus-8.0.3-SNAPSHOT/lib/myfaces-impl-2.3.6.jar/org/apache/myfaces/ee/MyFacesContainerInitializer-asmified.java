package asm.org.apache.myfaces.ee;
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
public class MyFacesContainerInitializerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/ee/MyFacesContainerInitializer", null, "java/lang/Object", new String[] { "jakarta/servlet/ServletContainerInitializer" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/servlet/annotation/HandlesTypes;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/bean/ApplicationScoped;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/bean/CustomScoped;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/component/behavior/FacesBehavior;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/render/FacesBehaviorRenderer;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/component/FacesComponent;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/convert/FacesConverter;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/render/FacesRenderer;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/validator/FacesValidator;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/model/FacesDataModel;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/event/ListenerFor;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/event/ListenersFor;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/bean/ManagedBean;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/bean/ManagedProperty;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/event/NamedEvent;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/bean/NoneScoped;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/bean/ReferencedBean;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/bean/RequestScoped;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/application/ResourceDependencies;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/application/ResourceDependency;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/bean/SessionScoped;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/bean/ViewScoped;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/component/UIComponent;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/convert/Converter;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/render/Renderer;"));
annotationVisitor1.visit(null, Type.getType("Ljakarta/faces/validator/Validator;"));
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/servlet/ServletRegistration$Dynamic", "jakarta/servlet/ServletRegistration", "Dynamic", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FACES_SERVLET_ADDED_ATTRIBUTE", "Ljava/lang/String;", null, "org.apache.myfaces.DYNAMICALLY_ADDED_FACES_SERVLET");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FACES_SERVLET_FOUND", "Ljava/lang/String;", null, "org.apache.myfaces.FACES_SERVLET_FOUND");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "INITIALIZE_ALWAYS_STANDALONE", "Ljava/lang/String;", null, "org.apache.myfaces.INITIALIZE_ALWAYS_STANDALONE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "INITIALIZE_SKIP_JAR_FACES_CONFIG_SCAN", "Ljava/lang/String;", null, "org.apache.myfaces.INITIALIZE_SKIP_JAR_FACES_CONFIG_SCAN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FACES_CONFIG_RESOURCE", "Ljava/lang/String;", null, "/WEB-INF/faces-config.xml");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FACES_SERVLET_MAPPINGS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FACES_SERVLET_FULL_MAPPINGS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FACES_SERVLET_NAME", "Ljava/lang/String;", null, "FacesServlet");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FACES_SERVLET_CLASS", "Ljava/lang/Class;", "Ljava/lang/Class<+Ljakarta/servlet/Servlet;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DELEGATED_FACES_SERVLET_CLASS", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onStartup", "(Ljava/util/Set;Ljakarta/servlet/ServletContext;)V", "(Ljava/util/Set<Ljava/lang/Class<*>;>;Ljakarta/servlet/ServletContext;)V", new String[] { "jakarta/servlet/ServletException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/ee/MyFacesContainerInitializer", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "INFO", "Ljava/util/logging/Level;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Using ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/ee/MyFacesContainerInitializer;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("org.apache.myfaces.SUPPORT_MANAGED_BEANS");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletContext", "getInitParameter", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/webapp/ManagedBeanDestroyerListener");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/webapp/ManagedBeanDestroyerListener", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletContext", "addListener", "(Ljava/util/EventListener;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/webapp/ManagedBeanDestroyerListener", "APPLICATION_MAP_KEY", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletContext", "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/ee/MyFacesContainerInitializer", "shouldStartupRegardless", "(Ljakarta/servlet/ServletContext;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "isEmpty", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/ee/MyFacesContainerInitializer", "isFacesConfigPresent", "(Ljakarta/servlet/ServletContext;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletContext", "getServletRegistrations", "()Ljava/util/Map;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Map", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/servlet/ServletRegistration");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletRegistration", "getClassName", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/ee/MyFacesContainerInitializer", "FACES_SERVLET_CLASS", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/ee/MyFacesContainerInitializer", "isDelegatedFacesServlet", "(Ljava/lang/String;)Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Map$Entry", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("org.apache.myfaces.FACES_SERVLET_FOUND");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletContext", "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("FacesServlet");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/ee/MyFacesContainerInitializer", "FACES_SERVLET_CLASS", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletContext", "addServlet", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/servlet/ServletRegistration$Dynamic;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/ee/MyFacesContainerInitializer", "isAutomaticXhtmlMappingDisabled", "(Ljakarta/servlet/ServletContext;)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/ee/MyFacesContainerInitializer", "FACES_SERVLET_MAPPINGS", "[Ljava/lang/String;");
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"jakarta/servlet/ServletRegistration$Dynamic"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/ee/MyFacesContainerInitializer", "FACES_SERVLET_FULL_MAPPINGS", "[Ljava/lang/String;");
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"[Ljava/lang/String;"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletRegistration$Dynamic", "addMapping", "([Ljava/lang/String;)Ljava/util/Set;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "isEmpty", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label12);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "(Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "removeAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletRegistration$Dynamic", "addMapping", "([Ljava/lang/String;)Ljava/util/Set;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[Ljava/lang/String;", "java/util/Set"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IFLE, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("org.apache.myfaces.DYNAMICALLY_ADDED_FACES_SERVLET");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletContext", "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/ee/MyFacesContainerInitializer", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "INFO", "Ljava/util/logging/Level;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Added FacesServlet with mappings=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "toString", "([Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/myfaces/ee/MyFacesContainerInitializer", "java/util/Set", "jakarta/servlet/ServletContext", "java/lang/String", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "shouldStartupRegardless", "(Ljakarta/servlet/ServletContext;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("org.apache.myfaces.INITIALIZE_ALWAYS_STANDALONE");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletContext", "getInitParameter", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLdcInsn("true");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "shouldSkipJarFacesConfigScan", "(Ljakarta/servlet/ServletContext;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("org.apache.myfaces.INITIALIZE_SKIP_JAR_FACES_CONFIG_SCAN");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletContext", "getInitParameter", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitLdcInsn("org.apache.myfaces.INITIALIZE_SKIP_JAR_FACES_CONFIG_SCAN");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitLdcInsn("true");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/myfaces/ee/MyFacesContainerInitializer", "jakarta/servlet/ServletContext"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "isAutomaticXhtmlMappingDisabled", "(Ljakarta/servlet/ServletContext;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("jakarta.faces.DISABLE_FACESSERVLET_TO_XHTML");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletContext", "getInitParameter", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitLdcInsn("false");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitLdcInsn("true");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/myfaces/ee/MyFacesContainerInitializer", "jakarta/servlet/ServletContext"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "isFacesConfigPresent", "(Ljakarta/servlet/ServletContext;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/lang/Exception");
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label2, "java/lang/Exception");
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label7, label8, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("/WEB-INF/faces-config.xml");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletContext", "getResource", "(Ljava/lang/String;)Ljava/net/URL;", true);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("jakarta.faces.CONFIG_FILES");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletContext", "getInitParameter", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(",");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "split", "(Ljava/lang/String;)[Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label10 = new Label();
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/myfaces/ee/MyFacesContainerInitializer", "jakarta/servlet/ServletContext", "java/lang/String", "[Ljava/lang/String;", "[Ljava/lang/String;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitJumpInsn(IF_ICMPGE, label9);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "trim", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletContext", "getResource", "(Ljava/lang/String;)Ljava/net/URL;", true);
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/myfaces/ee/MyFacesContainerInitializer", "jakarta/servlet/ServletContext", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/ee/MyFacesContainerInitializer", "shouldSkipJarFacesConfigScan", "(Ljakarta/servlet/ServletContext;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/context/servlet/StartupServletExternalContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/context/servlet/StartupServletExternalContextImpl", "<init>", "(Ljakarta/servlet/ServletContext;Z)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/spi/FacesConfigResourceProviderFactory", "getFacesConfigResourceProviderFactory", "(Ljakarta/faces/context/ExternalContext;)Lorg/apache/myfaces/spi/FacesConfigResourceProviderFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigResourceProviderFactory", "createFacesConfigResourceProvider", "(Ljakarta/faces/context/ExternalContext;)Lorg/apache/myfaces/spi/FacesConfigResourceProvider;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigResourceProvider", "getMetaInfConfigurationResources", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/Collection;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "isEmpty", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label6);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label8);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/myfaces/ee/MyFacesContainerInitializer", "jakarta/servlet/ServletContext"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "isDelegatedFacesServlet", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/ee/MyFacesContainerInitializer", "DELEGATED_FACES_SERVLET_CLASS", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/ee/MyFacesContainerInitializer;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/logging/Logger", "getLogger", "(Ljava/lang/String;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/ee/MyFacesContainerInitializer", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("/faces/*");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("*.jsf");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("*.faces");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/ee/MyFacesContainerInitializer", "FACES_SERVLET_MAPPINGS", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("/faces/*");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("*.jsf");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("*.faces");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("*.xhtml");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/ee/MyFacesContainerInitializer", "FACES_SERVLET_FULL_MAPPINGS", "[Ljava/lang/String;");
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/faces/webapp/FacesServlet;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/ee/MyFacesContainerInitializer", "FACES_SERVLET_CLASS", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/shared_impl/webapp/webxml/DelegatedFacesServlet;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/ee/MyFacesContainerInitializer", "DELEGATED_FACES_SERVLET_CLASS", "Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
