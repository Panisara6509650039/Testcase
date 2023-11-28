CXXFLAGS =	-O2 -g -Wall -fmessage-length=0

OBJS =		MyFirstCPP.o

LIBS =

TARGET =	MyFirstCPP.exe

$(TARGET):	$(OBJS)
	$(CXX) -o $(TARGET) $(OBJS) $(LIBS)

all:	$(TARGET)

clean:
	rm -f $(OBJS) $(TARGET)
